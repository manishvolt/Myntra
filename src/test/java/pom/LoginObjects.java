package pom;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginObjects {

WebDriver driver;

private By ProfileSection=By.xpath("//span[contains(text(),'Profile')]");
private By SignpOption=By.xpath("//a[contains(text(),'login / Signup')]");
private By Number=By.xpath("//input[@autocomplete='new-password']");
private By Password=By.xpath("//span[contains(text(),'Password')]");
private By PasswordField=By.xpath("//input[@class='form-control has-feedback']");
private By loginbutton=By.xpath("//button[contains(text(),'LOGIN')]");


public LoginObjects(WebDriver driver){
	this.driver=driver;
}

public void Go_In_Login() throws InterruptedException{
    
	 WebDriverWait wait=new WebDriverWait(driver, 20);
	 WebElement ProfSection=wait.until(ExpectedConditions.elementToBeClickable(ProfileSection));
	
	 //WebElement ProfSection=driver.findElement(ProfileSection);	
     WebElement SignInButton=driver.findElement(SignpOption);
     Actions log=new Actions(driver);
     log.moveToElement(ProfSection).click(SignInButton).build().perform();
     Thread.sleep(2000);
}


public void Enter_PhoneNumber(String text) throws InterruptedException{
      WebElement PhoneNumber=driver.findElement(Number);
      PhoneNumber.sendKeys(text);
      driver.findElement(By.xpath("//div[@class='submitBottomOption']")).click();
      Thread.sleep(2000);
}



public void ClickPassword() throws InterruptedException{
	WebDriverWait wait=new WebDriverWait(driver, 20);
	WebElement ClickPassword=wait.until(ExpectedConditions.elementToBeClickable(Password));
	ClickPassword.click();
	Thread.sleep(2000);
	/*WebElement HitPassword=driver.findElement(Password);
	HitPassword.click();
	Thread.sleep(2000);*/
}




public void Enter_Password(String text) throws InterruptedException{
	WebElement EnterPassword=driver.findElement(PasswordField);
	EnterPassword.sendKeys(text);
	Thread.sleep(2000);
}


public void HitLogin(){
   WebElement HitLogin=driver.findElement(loginbutton);
   HitLogin.click();
}

}
