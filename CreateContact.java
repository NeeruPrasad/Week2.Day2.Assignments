package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver cd=new ChromeDriver();
		cd.get("http://leaftaps.com/opentaps/control/login");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		cd.findElement(By.id("username")).sendKeys("DemoSalesManager");
		cd.findElement(By.id("password")).sendKeys("crmsfa");
		cd.findElement(By.className("decorativeSubmit")).click();
		cd.findElement(By.linkText("CRM/SFA")).click();
		cd.findElement(By.linkText("Contacts")).click();
		cd.findElement(By.linkText("Create Contact")).click();
		cd.findElement(By.id("firstNameField")).sendKeys("Neeraja");
		cd.findElement(By.id("lastNameField")).sendKeys("Korra");
		cd.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Neeru");
		cd.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("K");
		cd.findElement(By.name("departmentName")).sendKeys("Accounts");
		cd.findElement(By.name("description")).sendKeys("Class Accounts");
		cd.findElement(By.id("createContactForm_primaryEmail")).sendKeys("neeraja.korra@gmail.com");
		WebElement e1 = cd.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select s1=new Select(e1);
		s1.selectByVisibleText("New York");
		
		cd.findElement(By.name("submitButton")).click();
		cd.findElement(By.linkText("Edit")).click();
		cd.findElement(By.id("updateContactForm_description")).clear();
		cd.findElement(By.id("updateContactForm_importantNote")).sendKeys("Contact as Priority");
		cd.findElement(By.xpath("//input[@name='submitButton']")).click();
		System.out.println(cd.getTitle());
		
		
		
		
		
		

	}

}
