package week2.day2;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.List;

public class HyperLinksLeafGround {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.xpath("//img[@class='wp-categories-icon svg-image' and @src='images/link.png']")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String s=driver.getTitle();
		String s1="Not Found";
		if(s.contains(s1))
		{
			System.out.println("Link is broken");
		}
		else
		{
			System.out.println("Working fine");
		}
		driver.get("http://leafground.com/pages/Link.html");
		
		//go to homepage (interact with same link name)
		String interactPage=driver.findElement(By.xpath("//label[text()='(Interact with same link name)']/preceding-sibling::a")).getAttribute("href");
		String homePage=driver.findElement(By.linkText("Go to Home Page")).getAttribute("href");
		if(interactPage.equals(homePage))
		{
			System.out.println("Interacting with Same page link");
		}
		else
		{
			System.out.println("Not interacting with Same page link");
		}
		
		//List is not working
		List<WebElement> totalLink = driver.findElements(By.tagName("a"));
		int linkcount = totalLink.size();
		System.out.println("Number of links="+linkcount);
		
	}

}
		
		
		

