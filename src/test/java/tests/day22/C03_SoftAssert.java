package tests.day22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_SoftAssert extends TestBaseBeforeMethodAfterMethod {
    @Test(groups = "gp1")
    public void test01() {
        SoftAssert softAssert=new SoftAssert();
        //1-amazon anasayfaya gidin
        driver.get("https://amazon.com");
        //2-title in Amazon içerdigini test edin
        softAssert.assertTrue( driver.getTitle().contains("Amazon"),"girdiginiz kelimeyi icermiyor");
        //3-arama kutusnun erişilebilir oldugunu tets edin
        softAssert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isEnabled());
        //4-arama kutusuna Nuella yazıp aratın
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("nutella", Keys.ENTER);
        //5-arama yapıldıgını test edin
        WebElement resultWE = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(resultWE.isDisplayed(),"sonuc goruntulenmedi");
        //6-arama sonucunun Nutella içerdigini test edin
        softAssert.assertTrue(resultWE.getText().contains("nutella"),"nutella icermiyor");
        softAssert.assertAll();
        //SoftAssert baslangic ve bitis satirlari arasindaki tum assertion'lari yapip
        //bitis olarak belirtmemiz gereken assertAll() methoduyla test methodumuzdaki
        //butun assertion'lari kontrol eder. Failed olan olursa assertion yaptigimiz
        //methodun sonuna yazdigimiz mesaji bize konsolda verir.

    }
}
