import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase{
    private HomePage homePage;
    private RegisterPage registerPage;
    @Test (priority = 1)
    public void ValidRegister(){
        homePage=new HomePage(driver);
        registerPage=homePage.ClickingOnRegisterButton();
        registerPage.ChoosingGender();
        registerPage.EnterFirstName("Sherif");
        registerPage.EnterLastName("Arafa");
        registerPage.EnterEmail("Sjn@egy.com");
        registerPage.EnterPassword("123455");
        registerPage.EnterConfirmPassword("123455");
        registerPage.Registering();
    }

    @Test(priority = 2)
    public void InValidRegister(){
        homePage=new HomePage(driver);
        registerPage=homePage.ClickingOnRegisterButton();
        registerPage.ChoosingGender();
        registerPage.EnterFirstName("Sherif");
        registerPage.EnterLastName("Arafa");
        registerPage.EnterEmail("Sjn@egy.com");
        registerPage.EnterPassword("123455");
        registerPage.EnterConfirmPassword("12355");
        registerPage.Registering();
    }
}
