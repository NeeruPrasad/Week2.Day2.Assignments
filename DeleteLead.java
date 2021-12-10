package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		//setup chrome driver
				WebDriverManager.chromedriver().setup();
				
				//launch chrome browser
				ChromeDriver driver=new ChromeDriver();
				
				//ChromeOptions options=new ChromeOptions();
				//options.addArguments("--incognito");
				
				//load the url
				driver.get("http:leaftaps.com/opentaps");
				
				//Maximixe the browser
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
				//find the username and enter value
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				
				//find the password and enter value
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//find login button and click
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//click on CRM/SFA
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				
				driver.findElement(By.linkText("Leads")).click();
				
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();
				driver.findElement(By.name("phoneCountryCode")).clear();
				driver.findElement(By.name("phoneCountryCode")).sendKeys("+65");
				driver.findElement(By.name("phoneAreaCode")).sendKeys("00");
				driver.findElement(By.name("phoneNumber")).sendKeys("93209880");
				
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				
				String s=driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a")).getText();
				//System.out.println(s);
				Thread.sleep(5000);
				driver.findElement(By.xpath("(//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first ']//a)[1]")).click();
				driver.findElement(By.xpath("//a[text()='Delete']")).click();
				
				driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
				driver.findElement(By.xpath("//input[@name='id']")).sendKeys(s);
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
				driver.close();
			
	}
	
	

}
