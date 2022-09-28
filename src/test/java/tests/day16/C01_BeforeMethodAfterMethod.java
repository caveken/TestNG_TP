package tests.day16;

import org.testng.annotations.Test;
import utilities.utilities.TestBaseBeforeClassAfterClass;

public class C01_BeforeMethodAfterMethod extends TestBaseBeforeClassAfterClass {
    @Test
    public void testamazonTesti() {
        driver.get("https://amazon.com");
    }
}
