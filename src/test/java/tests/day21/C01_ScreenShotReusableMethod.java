package tests.day21;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.crypto.KeyAgreementSpi;
import java.io.IOException;

public class C01_ScreenShotReusableMethod {
    //hepsiburada sayfasına gidiniz
//ve sayfanın resmini alınız

    @Test
    public void test01() throws IOException {
        Driver.getDriver().get("https://hepsiburada.com");
        ReusableMethods.getScreenshot("hepsiburada");
        Driver.closeDriver();
    }

    @Test
    public void test02() throws IOException {
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        ReusableMethods.getScreenshotWebElement("AramaSonucWE",amazonPage.aramaSonucWE);
    }
}
