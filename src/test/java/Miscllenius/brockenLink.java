package Miscllenius;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class brockenLink {

	//public WebDriver driver;
	public int count=0;
	 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//this.driver=driver;
		
		String qaurl="https://www.amazon.in/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
			driver.get(qaurl);
			
			//driver.findElement(By.tagName("a")).get
			
			List<WebElement> links=driver.findElements(By.xpath("//a"));
			System.out.println(links.size());
			
			List<String> urlList=new ArrayList<String>();
			for(WebElement link:links ) {
				
				//String url=link.getAttribute("href");
				String url=link.getDomAttribute("href");
				urlList.add(url);
			}
			
			urlList.parallelStream().forEach(p->{
				try {
					brockenLink(p);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});
		
			

	}
	public static void brockenLink(String url1) throws IOException {
		int count=0;
		
		int okcount=0;
		int errorcount=0;
		//@SuppressWarnings("deprecation")
		try{
		URL link1=new URL(url1);
		HttpsURLConnection connection=(HttpsURLConnection) link1.openConnection();
		connection.setConnectTimeout(3000);
		//connection.setRequestMethod("HEAD");
		connection.connect();
		
		
		if(connection.getResponseCode()>=400) {
			System.out.println(url1+ "-"+ connection.getResponseMessage()+"-"+ "is a brocken link");
			//count++;
			
		}
		
		
		}
		catch(Exception e) {
			System.out.println("Error Occured");
			//errorcount++;
		}
			//System.out.println(count);
			//System.out.println(okcount);
			//System.out.println(errorcount);
	
	}
	
}
