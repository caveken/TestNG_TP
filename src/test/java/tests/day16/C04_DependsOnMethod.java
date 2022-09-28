package tests.day16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import utilities.utilities.TestBaseBeforeClassAfterClass;

public class C04_DependsOnMethod extends TestBaseBeforeClassAfterClass {
    @Test
    public void test1() {
        driver.get("https://amazon.com");
    }

    @Test (dependsOnMethods = "test1")
    public void test2() {
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella", Keys.ENTER);
    }

    @Test (dependsOnMethods = "test2")
    public void test3() {
        assert !driver.findElement(By.cssSelector("div[class=\"a-section a-spacing-small a-spacing-top-small\"]")).getText().contains("amazon");

    }
}
