package mytestcase;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import mainPack.Login;

public class loop {

	public static void main(String[] args) throws InterruptedException, BiffException, IOException {

//		for (int x=1; x<10; x++) 
		
		{
			
			FileInputStream fs = new FileInputStream("D:\\Data\\Eclipse\\Test.xls");
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet AddressSheet = wb.getSheet("User_Login");
			
			System.setProperty("webdriver.chrome.driver", "D:\\Data\\WebDriver\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("--incognito");
			WebDriver driver = new ChromeDriver(options);
		
			driver.get("https://demo.opencart.com/");
	        System.out.println("Site accessed");
	        
	        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")).click();
			
//			WebElement clickMyaccount;
//			clickMyaccount = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a/span[1]"));
//			clickMyaccount.click(); 
			
	        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
	        
//			WebElement clickLogin;
//			clickLogin = driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a"));
//			clickLogin.click(); 	
			
			Login loginobjects = new Login (driver);
			loginobjects.MyLog(AddressSheet.getCell(0,1).getContents(), AddressSheet.getCell(1,1).getContents());
			
//			driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("ssyar@yahoo.com");
//			driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("abcd1234");
			
//			WebElement login;
//			login = driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input"));
//			login.click(); 
	        System.out.println("Login successful");
	        
	        driver.close();		}

}
}
