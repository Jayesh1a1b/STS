package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenFlipkartApplication {
	@Test
	public void launchApplication2() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.close();
		Thread.sleep(200);
		System.out.println(" socket exception");
	}
}
