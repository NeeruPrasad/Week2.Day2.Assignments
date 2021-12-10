package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxLeafGround {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//div[@class='example']//input")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[3]")).click();
		WebElement e=driver.findElement(By.xpath("(//div[@class='example']//input)[6]"));
		if(e.isSelected())
		{
			System.out.println("Check box is checked");
		}
		else
		{
			System.out.println("Check box is unchecked");
		}
		WebElement e1=driver.findElement(By.xpath("(//div[@class='example']//input)[7]"));
		WebElement e2=driver.findElement(By.xpath("(//div[@class='example']//input)[8]"));
		if(e1.isSelected())
		{
			
			driver.findElement(By.xpath("(//div[@class='example']//input)[7]")).click();
			
		}
		if(e2.isSelected())
		{
			driver.findElement(By.xpath("(//div[@class='example']//input)[8]")).click();
		}
		
		driver.findElement(By.xpath("(//div[@class='example']//input)[9]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[10]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[11]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[12]")).click();
		driver.findElement(By.xpath("(//div[@class='example']//input)[13]")).click();
		
	}

}
