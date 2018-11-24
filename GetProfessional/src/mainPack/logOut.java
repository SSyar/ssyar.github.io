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
	
	@FindBy(xpath="//*[@id=\"column-right\"]/div/a[13]")
	public WebElement logO;
	
	public void LogOut() {
	logO.click();
	
	}
	
	}