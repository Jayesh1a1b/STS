package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenPaytmApplication {
	@Test
	public void launchApplication3() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.close();
		
	}
}
