package mainPack;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logOut {
	
	WebDriver driver;
	public logOut(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	public WebElement MA;
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[5]/a")
	public WebElement LO;
	
	
	public void LogOut() {
	MA.click();
	LO.click();
	}
	
	}