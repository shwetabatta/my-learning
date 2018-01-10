package ElementHandling.EleHand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EchoEchoRB {
	public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shweta\\Desktop\\Shweta\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.findElement(By.cssSelector("input[value='Milk']")).click();
		int count=driver.findElements(By.xpath("//input[@name='group1']")).size();
		
		for(int i=0;i<count;i++) {
			
		driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
		String nameRB= driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
		System.out.println(nameRB);
		Thread.sleep(500);	
		
		if(i==2)
			System.out.println("Got Cheese" +" "+ i);
		}
		
		driver.close();
	}
}