package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mongodb.client.model.geojson.Point;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageLeafGround {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		driver.findElement(By.xpath("//img[@class='wp-categories-icon svg-image' and @alt='Images']")).click();
		
		//(image is broken getting titles of both windows if both windows shows same title so the image is not clicked and the image is broken
		String s=driver.getTitle();
		WebElement e=driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
		if(e.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("Image is broken");
		}
		else
		{
			System.out.println("Image is not broken");
		}
		
		
		//Click using keyboard or mouse(do we need to get location or this is correct)
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
		
		

	}

}
