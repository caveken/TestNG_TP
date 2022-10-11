package tests.day21;

import org.testng.annotations.Test;
import pages.HepsiburadaPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;

public class C02_Odev_Hepsiburada {
    //Hepsiburada sayfasına gidiniz
    //Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
    //Her linkten sonra o sayfaya gittimizi test edelim ve o sayfanın resmini alalım
    //Sayfayı kapatalım
    HepsiburadaPage hepsiburadaPage;

    @Test
    public void test01() throws InterruptedException, IOException {
        //Hepsiburada sayfasına gidiniz
        Driver.getDriver().get("https://www.hepsiburada.com");
        //Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
        hepsiburadaPage = new HepsiburadaPage();
        ReusableMethods.hover(hepsiburadaPage.elektronik);
        ReusableMethods.hover(hepsiburadaPage.bilgisayarTablet);
        Thread.sleep(3000);


        for (int i = 0; i < 66; i++) {
            hepsiburadaPage.altBasliklar.get(i).click();
            ReusableMethods.waitFor(3);
            ReusableMethods.getScreenshot("hepsiburada_");
            ReusableMethods.waitFor(3);
            ReusableMethods.hover(hepsiburadaPage.elektronik);
            ReusableMethods.hover(hepsiburadaPage.bilgisayarTablet);
            Thread.sleep(3000);

        }
    }
}
