package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
	
    WebDriver chromedriver;
	
	String url = "https://dsportalapp.herokuapp.com/home";
	
	By registerBtn = By.xpath("//a[text()='/register']");
	By usname = By.id("id_username");
	By psword = By.name("password1");
	By confpsword = By.name("password2");
	By register = By.xpath("//input[@value='Register']");
	
	public void register(WebDriver chromeDriver) {
	 
	
 }
   
   public void registerClick() {
	   
	   chromedriver.findElement(registerBtn).click();
	   }
 
   
   public void sendUserName(String username) {
	   
	   chromedriver.findElement(usname).sendKeys("NinjaCoders");
	   } 
   
  public void sendPassword(String password) {
	   
	   chromedriver.findElement(psword).sendKeys("SDET135batch");
	   } 

  public void sendConfirmation(String confirmpassword) {
	   
	   chromedriver.findElement(confpsword).sendKeys("SDET135batch");
	   } 

  public void register() {
	   
	   chromedriver.findElement(register).click();
	   
	   } 


}







