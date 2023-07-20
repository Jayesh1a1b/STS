package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchPolicyBaazar {
	@Test
	public void launchPolicyBaazarApplication() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.policybazaar.com/");
		driver.close();
		
	}
}
