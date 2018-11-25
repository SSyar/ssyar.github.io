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
import mainPack.logAssert;
import mainPack.logOut;
import mainPack.orderCheckOut;

public class ExcelImportClass {
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
		
        driver.findElement(By.xpath("//*[text()='My Account']")).click();
		driver.findElement(By.xpath("//*[text()='Login']")).click();
				
		Login loginobjects = new Login (driver);
		loginobjects.MyLog(AddressSheet.getCell(0,1).getContents(), AddressSheet.getCell(1,1).getContents());
	
        logAssert logAssIn = new logAssert(driver);
        logAssIn.logAin();
        
        orderCheckOut orderCheckFirst = new orderCheckOut(driver);
        orderCheckFirst.oc();
        
		logOut logo = new logOut(driver);
		logo.LogOut();
        
        logAssert logAssOut = new logAssert(driver);
        logAssOut.logAout();
        
        }
	}


