package ElementHandling.EleHand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJetDDSel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shweta\\Desktop\\Shweta\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
		driver.get("http://www.spicejet.com");
		Thread.sleep(200);
		Select s= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("2");
		Thread.sleep(200);
		s.selectByVisibleText("7");
		Thread.sleep(200);
		s.selectByIndex(8);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		//driver.findElement(By.xpath("(//a[@value='DEL'])[2]")
		Thread.sleep(200);
		
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_Unmr")).isSelected());
		driver.findElement(By.cssSelector("#ctl00_mainContent_chk_Unmr")).click();
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_chk_Unmr")).isSelected());
		driver.close();	
	
	}

}
