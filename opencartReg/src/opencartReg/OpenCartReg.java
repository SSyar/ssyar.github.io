

package opencartReg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartReg {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Data\\WebDriver\\chromedriver243.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();				
		driver.get("https://demo.opencart.com/index.php?route=account/register");	

		 WebElement fname;
		 fname = driver.findElement(By.id("input-firstname"));
		 fname.sendKeys("Shahzada");
		 
		 WebElement lname;
		 lname = driver.findElement(By.id("input-lastname"));
		 lname.sendKeys("Shaheryar");
		 
		 WebElement email;
		 email = driver.findElement(By.id("input-email"));
		 email.sendKeys("shahzada.shaheryar@xynotech.com");
		 
		 driver.findElement(By.id("input-telephone")).sendKeys("0123456789");
		 
//		 WebElement tel;
//		 tel = driver.findElement(By.id("input-telephone"));
//		 tel.sendKeys("0123456789");
		 
		 WebElement pass;
		 pass = driver.findElement(By.id("input-password"));
		 pass.sendKeys("abcd1234");
		 
		 driver.findElement(By.id("input-confirm")).sendKeys("abcd1234"); 
		 
//		 WebElement cpass;
//		 cpass = driver.findElement(By.id("input-confirm"));
//		 cpass.sendKeys("abcd1234");
		 
		 WebElement radio;
//		 For Yes
//		 radio = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[1]/input"));

//		 For No
		 radio = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[2]/input"));
		 radio.click();
		 
		 WebElement check;
		 check = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]"));
		 check.click();
		 
//		 WebElement submit;
//		 submit = driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]"));
//		 submit.click();
	 
//		driver.close();
		
//		driver.quit();
		
	}

	
	

}

