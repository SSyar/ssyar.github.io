

package ContactUsCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class opencart {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Data\\WebDriver\\chromedriver243.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();				
		driver.get("https://demo.opencart.com/index.php?route=information/contact");	

		 WebElement name;
		 name = driver.findElement(By.id("input-name"));
		 name.sendKeys("Shahzada Shaheryar");
		 
		 WebElement email;
		 email = driver.findElement(By.id("input-email"));
		 email.sendKeys("shahzada.shaheryar@xynotech.com");

		 WebElement inqForm;
		 inqForm = driver.findElement(By.id("input-enquiry"));
		 inqForm.sendKeys("This is test message");

		 WebElement submitButton;  
		 submitButton = driver.findElement(By.xpath("//div[@id='content']/form/div/div/input"));
		 submitButton.click(); 

		 String actualpagetitle = driver.getTitle();
		 String expectedTitle = "Contact Us";
		 
		 if (actualpagetitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
		
		driver.close();
		
		driver.quit();
		
	
	
	
	
	}

	
	

}

