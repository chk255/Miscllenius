package Miscllenius;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class brockenLink2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> Links=driver.findElements(By.tagName("a"));
		System.out.println(Links.size());
		
		ArrayList<String> al=new ArrayList();
		for(WebElement Link:Links ) {
			
			String url=Link.getDomAttribute("href");
			al.add(url);
		}
		al.parallelStream().forEach(p->{
			try {
				brockenlink(p);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
	}
	
	public static void brockenlink(String url) throws IOException {
		
		try {
		URL url1=new URL(url);
		HttpURLConnection conn=(HttpURLConnection) url1.openConnection();
		conn.connect();
		int respCode=conn.getResponseCode();
		String respmsg=conn.getResponseMessage();
		int count=0;
		if(respCode>=400) {
			count++;
			
		System.out.println(url+" "+respCode +" "+ "with"+" "+ respmsg);
		}
		System.out.println(count);
	
		}
		catch(Exception e) {
			System.out.println(url+" "+ "is not Brocken" );
		}
		
	}

}
