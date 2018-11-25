package mainPack;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	WebDriver driver;
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		@FindBy(id="input-email")
		public WebElement emailid;

		@FindBy(id="input-password")
		public WebElement password;
		
		@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]/div/form/input")
		public WebElement submit;

		
		public void MyLog(String ID, String PWD) {
		emailid.sendKeys(ID);
		password.sendKeys(PWD);
		submit.click();
}
		
}

