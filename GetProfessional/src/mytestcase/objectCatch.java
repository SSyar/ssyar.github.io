package mytestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import mainPack.Login;
//import mainPack.orderCheckOut;
import mainPack.logAssert;
import mainPack.logOut;

public class objectCatch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\labit\\Downloads\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
	
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		Login logInFirst = new Login(driver);
		logInFirst.MyLog("ssyar@yahoo.com", "abcd1234");
        System.out.println("Login successful First");
        
        logAssert logAssIn = new logAssert(driver);
        logAssIn.logAin();
        
//        orderCheckOut orderCheckFirst = new orderCheckOut(driver);
//        orderCheckFirst.oc();
        
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


