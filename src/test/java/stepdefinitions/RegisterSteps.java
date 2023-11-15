package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RegisterPage;

public class RegisterSteps {
	
	 static WebDriver chromedriver;
	 
	 String url = "https://dsportalapp.herokuapp.com/home";
		
		By registerBtn = By.cssSelector("div.navbar-nav:nth-child(3) > ul:nth-child(2) > a:nth-child(2)");
		By usname = By.id("id_username");
		By psword = By.name("password1");
		By confpsword = By.cssSelector("#id_password2");
		By register = By.xpath("//input[@value='Register']");
		
    
	
	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
		
		System.out.println("We are on the register page");
		chromedriver = new ChromeDriver();
		chromedriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		chromedriver.get("https://dsportalapp.herokuapp.com/home");
		chromedriver.manage().window().maximize();
		
		chromedriver.findElement(registerBtn).click();
	   
	}

	@When("^The user enters (.*), (.*) and (.*)$")
	public void the_user_enters_q_atesters(String username, String password, String confirmpassword) {
		System.out.println("enters username and password");
		chromedriver.findElement(usname).sendKeys(username);
		chromedriver.findElement(psword).sendKeys(password);
		chromedriver.findElement(confpsword).sendKeys(confirmpassword);
		
      }
	
			
    @And("Clicks on register button")
	public void clicks_on_register_button() {
		
		System.out.println("Click on register button"); 
		
		chromedriver.findElement(register).click();
		
	}

	@Then("User is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		
		System.out.println("Navigates to homepage"); 
	    
	}

 

	

	

	

	

	

	

}
