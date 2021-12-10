package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TitlePrint {

	public static void main(String[] args) {
		//1. Load url "https://acme-test.uipath.com/login"
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//2. Enter email as "kumar.testleaf@gmail.com"
		
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		
		//3. Enter Password as "leaf@12"
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		
		//4. Click login button
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		//5. Get the title of the page and print
		System.out.println(driver.getTitle());
		
		//6. Click on Log Out
		driver.findElement(By.linkText("Log Out")).click();
		
		//7. Close the browser (use -driver.close())
		driver.close();
	}

}
