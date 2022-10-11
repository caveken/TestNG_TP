package tests.day22;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BlueRentalCarsPage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {
BlueRentalCarsPage blueRentalCarsPage;
Actions actions=new Actions(Driver.getDriver());
    @Test
    public void test01() throws InterruptedException {
        extentTest=extentReports.createTest("pozitif test","gecerli kullanici adi ve pasword ile giris yapildi");
        extentTest.info("blue rental cars sitesine gidildi");

        //https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get("login butonuna basildi");
        blueRentalCarsPage=new BlueRentalCarsPage();
        //login butonuna bas
        blueRentalCarsPage.brcLogin.click();
        extentTest.info("blue rental cars sitesine gidildi");

        //test data user email: customer@bluerentalcars.com ,
        //test data password : 12345 dataları girip login e basın
        //login butonuna tiklayin
        actions.sendKeys(blueRentalCarsPage.email,"customer@bluerentalcars.com")
                .sendKeys(Keys.TAB).sendKeys("12345")
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();
        Thread.sleep(3000);

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        WebElement select=blueRentalCarsPage.blueRentACar;
        Assert.assertTrue(select.isDisplayed());

    }
}
