import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage extends PageBase{

    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    private By genderMale= By.id("gender-male");
    private WebElement genderMaleElement;
    private By genderFemale= By.id("gender-female");
    private WebElement genderFemaleElement;
    private By firstName= By.id("FirstName");
    private WebElement firstNameElement;
    private By lastName= By.id("LastName");
    private WebElement lastNameElement;
    private By email= By.id("Email");
    private WebElement emailElement;
    private By companyName= By.id("Company");
    private WebElement companyElement;
    private By password= By.id("Password");
    private WebElement passwordElement;
    private By confirmPassword= By.id("ConfirmPassword");
    private WebElement repasswordElement;
    private By registerButton=By.id("register-button");
    private WebElement registerButtonElement;
    public void EnterFirstName(String fname){
        firstNameElement=driver.findElement(firstName);
        sendText(firstNameElement,fname);
    }
    public void EnterLastName(String lname){
        lastNameElement=driver.findElement(lastName);
        sendText(lastNameElement,lname);
    }
    public void EnterEmail(String emailt){
        emailElement=driver.findElement(email);
        sendText(emailElement,emailt);
    }
    public void EnterPassword(String passwordt){
        passwordElement= driver.findElement(password);
        sendText(passwordElement,passwordt);
    }
    public void EnterConfirmPassword(String repassword){
        repasswordElement= driver.findElement(confirmPassword);
        sendText(repasswordElement,repassword);
    }
    public void ChoosingGender(){
        genderFemaleElement=driver.findElement(genderMale);
        Clicking(genderFemaleElement);
    }
public void Registering(){
        registerButtonElement=driver.findElement(registerButton);
        Clicking(registerButtonElement);
    }

}
