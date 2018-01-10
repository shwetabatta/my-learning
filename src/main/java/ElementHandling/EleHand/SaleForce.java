package ElementHandling.EleHand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SaleForce {
	 public static void main( String[] args )
	    {
	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shweta\\Desktop\\Shweta\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.get("http://www.salesforce.com");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    	driver.findElement(By.linkText("LOGIN")).click();
	    	driver.findElement(By.id("username")).sendKeys("hello");
	    	driver.findElement(By.name("pw")).sendKeys("o123");
	    	driver.findElement(By.xpath("//*[@id='Login']")).click();
	    	System.out.println(driver.findElement(By.cssSelector("div#error.loginError")).getText());
	    	try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.close();

}
}