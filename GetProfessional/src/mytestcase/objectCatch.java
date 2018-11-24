package mytestcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import mainPack.Login;
import mainPack.logOut;

public class objectCatch {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\labit\\Downloads\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(options);
	
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		Login logIn = new Login(driver);
		logIn.MyLog();
        System.out.println("Login successful via OOPs");
        
        String LoginPageTitle = driver.getTitle();
		String expectedLogInTitle = "My Account";
		 
		if (LoginPageTitle.contentEquals(expectedLogInTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }

		logOut logo = new logOut(driver);
		logo.LogOut();
        System.out.println("Account Logout via OOPs");
        
        String LogoutPageTitle = driver.getTitle();
		String expectedLogOutTitle = "Account Logout";

		if (LogoutPageTitle.contentEquals(expectedLogOutTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
	}

}
