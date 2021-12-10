package week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListBoxesLeafGround {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement e=driver.findElement(By.id("dropdown1"));
		
		Select s=new Select(e);
		s.selectByIndex(2);

		
		WebElement e1=driver.findElement(By.name("dropdown2"));
		
		Select s1=new Select(e1);
		s1.selectByValue("1");
		
		WebElement e2=driver.findElement(By.id("dropdown3"));
		
		Select s2=new Select(e2);
		s2.selectByVisibleText("UFT/QTP");
		
		WebElement e3=driver.findElement(By.className("dropdown"));
		Select s3=new Select(e3);
		int count=0;
		for(int i=0;i<s3.getOptions().size();i++)
		{
			count++;
		}
		System.out.println("Number of elements in this dropdown are "+(count-1));
		
		//To get text from list of options from dropdown 
		
		WebElement x=driver.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/.."));
		Select x1=new Select(x);
		List<WebElement> options=x1.getOptions();
		String test="Selenium";
		for(WebElement webElement:options)
		{
			if(webElement.getText().equals(test))
			{
				x1.selectByVisibleText(test);
			}
				
			
		}
	}

}
