import org.testng.annotations.Test;

public class LoginPageTest extends TestBase{
    private HomePage homePage;
    private LoginPage loginPage;
    @Test(priority = 1)
    public void InValidLogin(){
        homePage=new HomePage(driver);
        loginPage=homePage.ClickingOnLoginButton();
        loginPage.EnterEmail("asldghb@gsd.com");
        loginPage.EnterPassword("123455");
        loginPage.Logging();
    }
    @Test(priority = 2)
    public void ValidLogin(){
        homePage=new HomePage(driver);
        loginPage=homePage.ClickingOnLoginButton();
        loginPage.EnterEmail("Sjn@egy.com");
        loginPage.EnterPassword("123455");
        loginPage.Logging();
    }
}
