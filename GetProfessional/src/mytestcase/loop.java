package mytestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class loop {

	public static void main(String[] args) throws InterruptedException {

		for (int x=1; x<10; x++) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\labit\\Downloads\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("--incognito");
			WebDriver driver = new ChromeDriver(options);
		
			driver.get("https://demo.opencart.com/");
	        System.out.println("Site accessed");
			
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
	        System.out.println("Login successful");
	        
	        driver.close();		}

}
}
