package mainPack;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class logAssert {
	
	WebDriver driver;
	public logAssert(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
   	 
	public void logAin() {
	
		 String LoginPageTitle = driver.getTitle();
		String expectedLogInTitle = "My Account";
		
		if (LoginPageTitle.contentEquals(expectedLogInTitle)){
            System.out.println("Login successful");
        } else {
            System.out.println("Login failed");
        }
	}
	
	public void logAout() {	
        String LogoutPageTitle = driver.getTitle();
		String expectedLogOutTitle = "Account Logout";

		if (LogoutPageTitle.contentEquals(expectedLogOutTitle)){
            System.out.println("Logout successful");
        } else {
            System.out.println("Logout failed");
	
	}
	}
}
	
	
	
	