package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C03_Priority extends TestBaseBeforeMethodAfterMethod {
    @Test (priority = 1)
    public void youtubeTest() {
        driver.get("https://www.youtube.com");
    }

    @Test (priority = 3)
    public void bestBuyTest() {
        driver.get("https://www.bestbuy.com");
    }

    @Test (priority = 2)
    public void amazonTest() {
        driver.get("https://www.amazon.com");
    }
    /*
    Testelirimizi calistirirken istedigimiz siraya gore calismasini istersek
    @Test objesinin bulundugu yere prority() methodunu kullaniriz
    priority kullanmaz isek default olarak 0 dir.(priority atanmayan @Test ilk olarak calisir)
    */
}
