

package ContactUsCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wixsite {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Data\\WebDriver\\chromedriver243.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();				
		driver.get("https://qatestid12.wixsite.com/qaspecialist");	

		 WebElement name;
		 name = driver.findElement(By.id("comp-jhrgftz1input"));
		 name.sendKeys("Shahzada Shaheryar");
		 
		 WebElement email;
		 email = driver.findElement(By.id("comp-jhrggrufinput"));
		 email.sendKeys("shahzada.shaheryar@xynotech.com");

		 WebElement subject;
		 subject = driver.findElement(By.id("comp-jhrgh32ainput"));
		 subject.sendKeys("My inquiry");
		 
		 WebElement inquiry;
		 inquiry = driver.findElement(By.id("comp-jhrgk2pstextarea"));
		 inquiry.sendKeys("Hello this this test message");

		 WebElement submitButton;  
		 submitButton = driver.findElement(By.id("comp-jhrgemmllink"));
//		 submitButton = driver.findElement(By.xpath("//*[@id=\"comp-jhrgemmllink\"]"));
		 submitButton.click(); 
	     
		 WebElement msg=driver.findElement(By.id("comp-jhrgemmd"));
		 
		 String text=msg.getText();
		 
		 WebDriverWait wait = new WebDriverWait(driver, 10);
		 
		 if (msg.isEnabled() && text.contains("Thanks for submitting!"))
		 { 
		     System.out.println("Test Passed!");
		 }else{
		     System.out.println("Test Failed");
		 }
		 
//		 String confirmation = driver.getText();
//		 String confirmText = "Thanks for submitting!";
		 
//		 if (confirmation.contentEquals(confirmText)){
//	            System.out.println("Test Passed!");
//	        } else {
//	            System.out.println("Test Failed");
//	        }
		
//		driver.close();
		
//		driver.quit();
		
	}

	
	

}

