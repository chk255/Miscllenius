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

public class SwitchWindow {

	public static void main(String[] args) throws InterruptedException {

		String URL = "https://www.orangehrm.com/";
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);

		String currentwindow = driver.getWindowHandle();

		Thread.sleep(2000);
		WebElement footer = driver.findElement(By.xpath("//div[@class='footer-main-section']"));
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		List<WebElement> links = driver.findElements(By.xpath("//h5[text()='About Us']//following-sibling::ul/li/a"));

		for (WebElement e : links) {

			String Name = e.getText();
			e.getSize().getHeight();
			e.getSize().getWidth();
			System.out.println(Name);
			System.out.println(e.getSize().getHeight());
			System.out.println(e.getSize().getWidth());

			Thread.sleep(2000);
			if (Name != "") {

				e.click();

			}
		}

		Thread.sleep(2000);
		Set<String> openlinks = driver.getWindowHandles();

		for (String s : openlinks) {

			String Title = driver.switchTo().window(s).getTitle();
			if (Title.contains("Executive Profiles")) {
				System.out.println(Title);
				driver.switchTo().window(s);

				Thread.sleep(2000);
				System.out.println(driver.getCurrentUrl());
				System.out.println(s);

			}
			if (!s.equals(currentwindow)) {
				driver.switchTo().window(s).close();
			}
		}

		driver.switchTo().window(currentwindow);
		System.out.println("Currentwindow" + currentwindow);
		driver.navigate().refresh();
	}
	


}
