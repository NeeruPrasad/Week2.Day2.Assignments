package week2.day2;

import java.awt.List;
import java.lang.StackWalker.Option;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LastButOne_FromDropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver cd=new ChromeDriver();
		cd.get("http://leafground.com/pages/Dropdown.html");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 //Assign and Select the dropdown list element
        WebElement e=cd.findElement(By.xpath("//option[text()='You can also use sendKeys to select']/.."));
      Select s=new Select(e);
     int size= s.getOptions().size()-1;
     s.selectByIndex(size);
      
	}

}
