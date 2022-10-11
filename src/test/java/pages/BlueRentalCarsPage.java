package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BlueRentalCarsPage {
    public BlueRentalCarsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@class='btn btn-primary btn-sm']")
    public WebElement brcLogin;

    @FindBy(xpath = "//*[@id='formBasicEmail']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='formBasicPassword']")
    public WebElement password;

    @FindBy(id = "//*[@class='navbar-brand']")
    public WebElement blueRentACar;




}
