package tests.day23;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;


public class C01_DataProvider extends TestBaseRapor {
    @DataProvider
    public static Object[][] aranacakKelimeler() {
        return new Object[][]{{"java"},{"selenium"},{"samsung"},{"iphone"}};
    }

    @Test
    public void test01() {
        extentTest = extentReports.createTest("test01", "Web automation");
        AmazonPage amazonPage = new AmazonPage();
        //Amazon sayfasına gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        extentTest.info(" //Amazon sayfasına gidelim");

        //Nutella için arama yapalım
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        extentTest.info(" //Nutella için arama yapalım");

        //sonuclarin nutella icerdigini test edelim
        String expectedKelime = "Nutella";
        String actualKelime = amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualKelime.contains(expectedKelime));
        Driver.closeDriver();
        extentTest.pass("Aramayla ilgili ürünün (\"nutella\") görünür olduğu doğrulandı");

    }

    @Test(dataProvider="aranacakKelimeler")
    public void test02(String kelimeler) {
        extentTest = extentReports.createTest("test02", "Web coklu arama");
        AmazonPage amazonPage=new AmazonPage();
        //amazona gidelim
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        extentTest.info("  //amazona gidelim");

        //java, selenium, samsung ve iphone icin arama yapalim
        amazonPage.aramaKutusu.sendKeys(kelimeler,Keys.ENTER);
        extentTest.info("  //java, selenium, samsung ve iphone icin arama yapalim");

        //sonuclarin aradigimiz kelime icerdigini test edelim
        String actualKelime=amazonPage.aramaSonucWE.getText();
        Assert.assertTrue(actualKelime.contains(kelimeler));
        extentTest.info(" //sonuclarin aradigimiz kelime icerdigini test edelim\n");
        Driver.quitDriver();
        extentTest.pass("Aramayla ilgili ürünün (\"coklu\") görünür olduğu doğrulandı");

    }
}
