package ElementHandling.EleHand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shweta\\Desktop\\Shweta\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*  ID & BASIC ATTRIBUTES
		driver.findElement(By.id("email")).sendKeys("hello");
		driver.findElement(By.id("pass")).sendKeys("hello123");
		driver.findElement(By.linkText("Forgotten account?")).click();
		*/
		
		/* CSS & XPATH
		driver.findElement(By.cssSelector("#email")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("hello");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
		//*[@id="login_form"]/table/tbody/tr[3]/td[2]/div/a
		*/
		

		// CUSTOMISED CSS & XPATH
		//tagName[@attribute='value']  - xpath
		//driver.findElement(By.xpath("//*[@type='email']")).sendKeys("myown xpath");
		
		
		driver.findElement(By.xpath("//input[contains(@name,'ema')]")).sendKeys("my own xpath");//regular expression
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello");
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
		//tagName[v='value']  -CSS
		/*driver.findElement(By.cssSelector("input[name='email']")).sendKeys("myowncss");
		driver.findElement(By.cssSelector("[value='Log In']")).click();
		*/
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.close();

    }
}
