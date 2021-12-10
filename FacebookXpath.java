package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver cd=new ChromeDriver();
		cd.get("https://www.facebook.com/");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		cd.findElement(By.linkText("Create New Account")).click();
		
		
		//cd.findElement(By.name("firstname")).sendKeys("Neeru");
		cd.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Neeru");
		
		
		//cd.findElement(By.name("lastname")).sendKeys("Korra");
		cd.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Korra");
		
		
		//cd.findElement(By.name("reg_email__")).sendKeys("93209880");
		cd.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("93209880");
		
		
		//cd.findElement(By.id("password_step_input")).sendKeys("NeeruKorra@123");
		cd.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("NeeruKorra@123");
		
		
		WebElement eleDD1=cd.findElement(By.xpath("//select[@id='day']"));
		Select select=new Select(eleDD1);
		select.selectByValue("10");
		
		
		WebElement eleDD2=cd.findElement(By.xpath("//select[@id='month']"));
		Select select1=new Select(eleDD2);
		select1.selectByIndex(5);
		
		WebElement eleDD3=cd.findElement(By.xpath("//select[@id='year']"));
		Select select2=new Select(eleDD3);
		select2.selectByValue("1987");
		
		cd.findElement(By.xpath("//label[@class='_58mt']")).click();
		
		cd.close();
		
		
		
		
		

	}

}
