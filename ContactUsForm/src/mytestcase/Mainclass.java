

package mytestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mainclass {

	public static void main(String[] args) {
		
		System.out.println("Hello World");

		
		System.setProperty("webdriver.chrome.driver", "D:\\Setups\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();				
		driver.get("https://demo.opencart.com/index.php?route=account/login");	


		 WebElement username;
		 username = driver.findElement(By.id("input-email"));
		 username.sendKeys("mytc5@gmail.com");

		 WebElement Password;
		 Password = driver.findElement(By.id("input-password"));
		 Password.sendKeys("123456789");

		 WebElement loginButton;  
		 loginButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
		 loginButton.click(); 

		 String actualpagetitle = driver.getTitle();
		 String expectedTitle = "My Account";
		 
		 if (actualpagetitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
		
		driver.close();
		
		driver.quit();
		
	
	
	
	
	}

	
	

}

