import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    private By email= By.id("Email");
    private WebElement emailElement;
    private By password= By.id("Password");
    private WebElement passwordElement;
    private By loginButton=By.cssSelector(".button-1.login-button");
    private WebElement loginButtonElement;
    public void EnterEmail(String emailt){
        emailElement=driver.findElement(email);
        sendText(emailElement,emailt);
    }
    public void EnterPassword(String passwordt){
        passwordElement=driver.findElement(password);
        sendText(passwordElement,passwordt);
    }
    public void Logging(){
        loginButtonElement=driver.findElement(loginButton);
        Clicking(loginButtonElement);
    }
}
