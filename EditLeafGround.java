package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeafGround {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("email")).sendKeys("neeraja.korra@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("abc");
		String s=driver.findElement(By.name("username")).getText();
		System.out.println(s);
		driver.findElement(By.xpath("//label[text()='Clear the text']/following-sibling::input")).clear();
		if(driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following-sibling::input")).isEnabled())
		{
			System.out.println("Edit field is Enabled");
			
		}
		else
		{
			System.out.println("Edit field is Disabled");
			
		}

	}

}
