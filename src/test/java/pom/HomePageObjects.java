package pom;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePageObjects {


WebDriver driver;

private By ProfileSection=By.xpath("//span[contains(text(),'Profile')]");
String phonenumber="7507190724";

public HomePageObjects(WebDriver driver){
	this.driver=driver;
}


public void VerifyLogin(){
   WebDriverWait wait=new WebDriverWait(driver, 20);
   WebElement ProfSection=wait.until(ExpectedConditions.elementToBeClickable(ProfileSection));
   Actions log=new Actions(driver);
   log.moveToElement(ProfSection).build().perform();

   if(driver.findElement(By.xpath("//div[contains(text(),'7507190724')]")).equals(phonenumber)){
	Assert.assertTrue(true);
      }
   
	else{
		Assert.assertFalse(false);
	}

	}
	


}
