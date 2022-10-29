package tests.day21;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import tests.log4J.Log4JTest2;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.crypto.KeyAgreementSpi;
import java.io.IOException;

public class C01_ScreenShotReusableMethod {
    private static Logger logger = LogManager.getLogger(C01_ScreenShotReusableMethod.class.getName());
    //hepsiburada sayfasına gidiniz
//ve sayfanın resmini alınız

    @Test
    public void test01() throws IOException {
        logger.info("hepsi burada sitesine gidilir ");
        Driver.getDriver().get("https://hepsiburada.com");
        logger.info("ekran goruntusu alınır");
        ReusableMethods.getScreenshot("hepsiburada");
        logger.warn("driver kapatılır");
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
