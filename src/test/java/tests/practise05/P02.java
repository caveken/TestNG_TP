package tests.practise05;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class P02 extends TestBaseBeforeMethodAfterMethod {
    // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
// 2. JavaScript alertin "CLICK ME!" seçeneğine tıklayın
// 3. Açılır metni alın
// 4. Mesajın "I am an alert box!" olduğunu doğrulayın.
// 5. Açılır pencereyi kabul edin


    @Test
    public void test01() {
    driver.get("http://webdriveruniversity.com/Popup-Alerts/index.html");
    driver.findElement(By.xpath("(//p[text()='CLICK ME!'])[1]")).click();
    String alertText=driver.switchTo().alert().getText();
        Assert.assertEquals("I am an alert box!",alertText);
        driver.switchTo().alert().accept();
    }
}
