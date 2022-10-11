package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.Driver;

public class Allure2YouPage {

    public Allure2YouPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='My Account']")
    public WebElement MyAccount;

    @FindBy(xpath = "//a[normalize-space()='Dashboard']")
    public WebElement Dashboard;

    @FindBy(xpath = "//li[@class='woocommerce-MyAccount-navigation-link woocommerce-MyAccount-navigation-link--orders']//a[contains(text(),'Orders')]")
    public WebElement Orders;

    @FindBy(xpath = "//a[contains(text(),'Downloads')]")
    public WebElement Downloads;

    @FindBy(xpath = "//a[contains(text(),'Addresses')]")
    public WebElement Addresses;

    @FindBy(xpath = "//a[contains(text(),'Account details')]")
    public WebElement AccountDetails;


}
