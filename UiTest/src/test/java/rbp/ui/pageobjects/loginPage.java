package rbp.ui.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage extends basePage
{
	
	@FindBy(how = How.ID, using ="username")
    private WebElement txtUsername;

    @FindBy(how = How.ID, using ="password")
    private WebElement txtPassword;

    @FindBy(how = How.ID, using ="doLogin")
    private WebElement btnLogin;

    public loginPage(WebDriver driver)
    {
        super(driver);
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
    }

    public loginPage enterUsername(String username)
    {
        txtUsername.sendKeys(username);
        return this;
    }

    public loginPage enterPassword(String password)
    {
        txtPassword.sendKeys(password);
        return this;
    }

    public void clickLogin()
    {
        btnLogin.click();
    }
}
