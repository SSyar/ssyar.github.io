

package ContactUsCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class product {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Setups\\Java\\chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
	
		driver.get("https://demo.opencart.com/");
		
		WebElement clickMyaccount;
		clickMyaccount = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
		clickMyaccount.click(); 
		
		WebElement clickLogin;
		clickLogin = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
		clickLogin.click(); 	
		
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("ssyar@yahoo.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("abcd1234");
		
		WebElement login;
		login = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
		login.click(); 
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("HP LP3065");
		
		WebElement searchClick;
		searchClick = driver.findElement(By.xpath("//*[@id=\"search\"]/span/button/i"));
		searchClick.click();
		
		WebElement clickProduct;
		clickProduct = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[1]/h4/a"));
		clickProduct.click();

		WebElement addtocart;
		addtocart = driver.findElement(By.xpath("//*[@id=\"button-cart\"]"));
		addtocart.click();

		WebElement checkout;
		checkout = driver.findElement(By.xpath("//*[@id=\"cart-total\"]"));
		checkout.click(); 
		
		driver.get("https://demo.opencart.com/index.php?route=checkout/checkout");
		
		Thread.sleep(5000);
		
		WebElement msg = driver.findElement(By.xpath("//*[@id=\"collapse-payment-address\"]/div/form/div[1]/label"));
		
		String text = msg.getText();	
		String expectedText = "I want to use an existing address";
		
		 if (text.contentEquals(expectedText))
		 { 
				WebElement contBilling;
				contBilling = driver.findElement(By.xpath("//*[@id=\"button-payment-address\"]"));
				contBilling.click(); 
		 }else{
			

				driver.findElement(By.xpath("//*[@id=\"input-payment-firstname\"]")).sendKeys("Shahzada");
				driver.findElement(By.xpath("//*[@id=\"input-payment-lastname\"]")).sendKeys("Shaheryar");
				driver.findElement(By.xpath("//*[@id=\"input-payment-address-1\"]")).sendKeys("Address 1");
				driver.findElement(By.xpath("//*[@id=\"input-payment-city\"]")).sendKeys("My City");
				driver.findElement(By.xpath("//*[@id=\"input-payment-postcode\"]")).sendKeys("75300");
				driver.findElement(By.xpath("//*[@id=\"input-payment-country\"]")).sendKeys("Pakistan");
				driver.findElement(By.xpath("//*[@id=\"input-payment-zone\"]")).sendKeys("Sindh");
				
				WebElement contBilling;
				contBilling = driver.findElement(By.xpath("//*[@id=\"button-payment-address\"]"));
				contBilling.click(); 
		 }

			Thread.sleep(2000);
		 	WebElement deliveryDetails;
			deliveryDetails = driver.findElement(By.xpath("//*[@id=\"button-shipping-address\"]"));
			deliveryDetails.click(); 
			
			Thread.sleep(2000);
			WebElement deliveryMethod;
			deliveryMethod = driver.findElement(By.xpath("//*[@id=\"button-shipping-method\"]"));
			deliveryMethod.click(); 
			
			Thread.sleep(2000);			
			WebElement paymentMethod;
			paymentMethod = driver.findElement(By.xpath("//input [@type='checkbox']"));
			paymentMethod.click();
			
			Thread.sleep(2000);
			WebElement paymentMethodButton;
			paymentMethodButton = driver.findElement(By.xpath("//input [@type=\"button\" and @id=\"button-payment-method\"]"));
			paymentMethodButton.click();

			Thread.sleep(2000);
			WebElement confirmOrderButton;
			confirmOrderButton = driver.findElement(By.xpath("//*[@id=\"button-confirm\"]"));
			confirmOrderButton.click();
			
			Thread.sleep(2000);
			String actualpagetitle = driver.getTitle();
			String expectedTitle = "Your order has been placed!";
			 
			if (actualpagetitle.contentEquals(expectedTitle)){
		            System.out.println("Test Passed!");
		        } else {
		            System.out.println("Test Failed");
		        }
			
//		driver.close();
//		
//		driver.quit();
		
	
	
	
	
	}

	
	

}

