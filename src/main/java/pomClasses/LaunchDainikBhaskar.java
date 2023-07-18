package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchDainikBhaskar 
{
	@Test
public void launchApplication1() throws InterruptedException
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.bhaskar.com/");
	driver.close();
	Thread.sleep(2);
}
}
