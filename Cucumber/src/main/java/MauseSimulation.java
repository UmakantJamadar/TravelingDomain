import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MauseSimulation {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stubs
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//a[@data-csa-c-id='g7k0lr-lei8ok-wz1ptw-4pcp7v']"));
		Thread.sleep(2000);
	
		//driver.findElement(By.xpath("//div[text()='Mobiles']"));
		

	}

}
