package Miscllenius;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureSS {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String URL = "https://www.orangehrm.com/";
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File Src=ts.getScreenshotAs(OutputType.FILE);
		File Des=new File("test-output/Screenshot/ss5.png");
		FileUtils.copyFile(Src, Des);
		
		WebElement logo=driver.findElement(By.xpath("(//img[@alt='OrangeHRM Logo'])[1]"));
		
	
		File Src1=logo.getScreenshotAs(OutputType.FILE);
		File Des1=new File("test-output/Screenshot/ss6.png");
		FileUtils.copyFile(Src1, Des1);
		
	}

}
