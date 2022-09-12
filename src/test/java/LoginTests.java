import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class LoginTests extends TestBase {


    @Test
    public void loginSuccess() {

        //open login form
        WebElement loginTab = wd.findElement(By.xpath("//a[@href='/login']"));
        loginTab.click();

        pause(2000);

        //fill email pablo.thebestqa@gmail.com
        WebElement inputEmail = wd.findElement(By.xpath("//input[@placeholder='Email']"));
        inputEmail.click();
        inputEmail.clear();
        inputEmail.sendKeys("pablo.thebestqa@gmail.com");

        //fill password TheBestTester_123
        WebElement inputPassword = wd.findElement(By.xpath("//input[@placeholder='Password']"));
        inputPassword.click();
        inputEmail.clear();
        inputPassword.sendKeys("TheBestTester_123");

        //Submit LoginBtn
        WebElement loginBtn = wd.findElement(By.xpath("//*[text()=' Login']"));
        loginBtn.click();


    }

    @Test
    public void loginNegativeWrongEmailFormat() {

    }

    @Test
    public void loginNegativeWrongPasswordFormat() {

    }


}
