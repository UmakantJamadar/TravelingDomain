package Selenium_Prac;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MouseSimulation {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver-win32//chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.flipkart.com/");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	    Thread.sleep(2000);
	    System.out.println("Click on cross bar");
	}

}
