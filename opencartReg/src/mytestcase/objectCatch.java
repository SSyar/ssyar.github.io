package mytestcase;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import mainPack.Login;
import mainPack.logAssert;
import mainPack.logOut;
import mainPack.orderCheckOut;

public class objectCatch {
	public static void main(String[] args) throws InterruptedException, BiffException, IOException {
		
		FileInputStream fs = new FileInputStream("D:\\Setups\\Java\\Test.xls");
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet AddressSheet = wb.getSheet("User_Login");
		
		System.setProperty("webdriver.chrome.driver", "D:\\Setups\\Java\\chromedriver.exe");
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
		
		Login loginobjects = new Login (driver);
		loginobjects.MyLog(AddressSheet.getCell(0,1).getContents(), AddressSheet.getCell(1,1).getContents());
	
//		driver.get("https://demo.opencart.com/index.php?route=account/login");
//		Login logInFirst = new Login(driver);
//		logInFirst.MyLog("ssyar@yahoo.com", "abcd1234");
//        System.out.println("Login successful First");
        
        logAssert logAssIn = new logAssert(driver);
        logAssIn.logAin();
        
        orderCheckOut orderCheckFirst = new orderCheckOut(driver);
        orderCheckFirst.oc();
        
		logOut logo = new logOut(driver);
		logo.LogOut();
//        System.out.println("Account Logout First");
//        
//        logAssert logAssOut = new logAssert(driver);
//        logAssOut.logAout();
        
//		driver.get("https://demo.opencart.com/index.php?route=account/login");
//		Login logInSecond = new Login(driver);
//		logInSecond.MyLog("ssyar@yahoo.com", "abcd1234");
//        System.out.println("Login successful Second");
//        
//        logAssert logAssInSecond = new logAssert(driver);
//        logAssInSecond.logAin();
//        
//		logOut logoSecond = new logOut(driver);
//		logoSecond.LogOut();
//        System.out.println("Account Logout Second");
//        
//        logAssert logAssOutSecond = new logAssert(driver);
//        logAssOutSecond.logAout();
        
        }
	}


