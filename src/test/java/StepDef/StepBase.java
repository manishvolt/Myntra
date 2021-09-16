package StepDef;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.HomePageObjects;
import pom.LoginObjects;

public class StepBase {

	
WebDriver driver;
LoginObjects obj;
HomePageObjects obj1;

@Given("browser is launched")
public void browser_is_launched(){
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manish\\New folder\\E-commerce\\chromedriver.exe");	
driver=new ChromeDriver();

}



@And("url is hit")
public void url_is_hit(){
driver.get("https://www.myntra.com/");
}



@When("user signin with {string} and {string}")
public void user_signin_with_and(String phonenumber, String password) throws InterruptedException {
	obj=new LoginObjects(driver);
	obj.Go_In_Login();
	obj.Enter_PhoneNumber(phonenumber);
	obj.ClickPassword();
	obj.Enter_Password(password);
	obj.HitLogin();
    
}



@Then("user is logged in")
public void user_is_logged_in(){
    obj1 = new HomePageObjects(driver);
    obj1.VerifyLogin();
	System.out.println(" Login Successful");
}

@Then("browser closed")
public void browser_closed(){
	driver.close();
}

}
