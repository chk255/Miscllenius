package Miscllenius;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchWindow2 {

	public WebDriver driver;
	static String URL = "https://www.orangehrm.com/";
	static String currentwindow;
	
	public SwitchWindow2() {
		
	}
	
	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);

	    currentwindow = driver.getWindowHandle();

		SwitchWindow2.openlinks(driver);
		Thread.sleep(2000);
		SwitchWindow2.switchtowindow(driver);
		SwitchWindow2.switchtocurrentwindow(driver, currentwindow);
		driver.navigate().refresh();
	}
	
	public static void openlinks(WebDriver driver) throws InterruptedException {
		
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		List<WebElement> links = driver.findElements(By.xpath("//h5[text()='About Us']//following-sibling::ul/li/a"));

		for (WebElement e : links) {

			String Name = e.getText();
			Thread.sleep(2000);
			if (Name != "") {
				e.click();
			}
		}
	}

	public static void switchtowindow(WebDriver driver) throws InterruptedException {
		Set<String> openlinks = driver.getWindowHandles();

		for (String s : openlinks) {

			String Title = driver.switchTo().window(s).getTitle();
			if (Title.contains("Executive Profiles")) {
				
				driver.switchTo().window(s);
				System.out.println("Switched Window Tile "+Title);

				Thread.sleep(2000);
				System.out.println("Switched Window Current URL "+ driver.getCurrentUrl());
				System.out.println(s);

			}
			if (!s.equals(currentwindow)) {
				driver.switchTo().window(s).close();
			}
		}
	}

    public static void  switchtocurrentwindow(WebDriver driver , String Cwindow) {
		driver.switchTo().window(Cwindow);
		System.out.println("Currentwindow" + Cwindow);
    }
}
