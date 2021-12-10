package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
	
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
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("neeraja.korra@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String s=driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a")).getText();
		//System.out.println(s);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//td[@class='x-grid3-col x-grid3-cell x-grid3-td-firstName ']//a")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		String s1=driver.getTitle();
		System.out.println(s1);
		if(s1.contentEquals("Duplicate Lead | opentaps CRM"))
		{
			
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();
			String s2=driver.findElement(By.id("viewLead_firstName_sp")).getText();
			//System.out.println(s2);
			if(s2.equals(s))
			{
				System.out.println("Lead is duplicated");
			}
		}
		
		//driver.close();

	}

}
