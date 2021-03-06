package rbp.ui.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage extends basePage {
	
	@FindBy(how = How.ID, using = "hotelName")
    private WebElement txtHotelName;

    @FindBy(how = How.ID, using = "address")
    private WebElement txtAddress;

    @FindBy(how = How.ID, using = "owner")
    private WebElement txtOwner;

    @FindBy(how = How.ID, using = "phone")
    private WebElement txtPhoneNumber;

    @FindBy(how = How.ID, using = "email")
    private WebElement txtEmail;

    @FindBy(how = How.ID, using = "createHotel")
    private WebElement btnCreate;

    public homePage(WebDriver driver)
    {
        super(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.col-sm-2.rowHeader")));
    }

    public homePage enterHotelName(String hotelName) throws InterruptedException
    {
    	txtHotelName.clear();
        txtHotelName.sendKeys(hotelName);
        Thread.sleep(200);
        return this;
    }

    public homePage enterAddress(String address) throws InterruptedException
    {
    	txtAddress.clear();
        txtAddress.sendKeys(address);
        Thread.sleep(200);
        return this;
    }

    public homePage enterOwner(String owner) throws InterruptedException
    {
    	txtOwner.clear();
        txtOwner.sendKeys(owner);
        Thread.sleep(200);
        return this;
    }

    public homePage enterPhone(String phone) throws InterruptedException
    {
    	txtPhoneNumber.clear();
        txtPhoneNumber.sendKeys(phone);
        Thread.sleep(200);
        return this;
    }

    public homePage enterEmail(String email) throws InterruptedException
    {
    	txtEmail.clear();
        txtEmail.sendKeys(email);
        Thread.sleep(200);
        return this;
    }

    public homePage clickCreate() throws InterruptedException
    {
        Thread.sleep(200);
        btnCreate.click();
        Thread.sleep(200);
        return new homePage(driver);
    }
}
