package tests.practise05;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class P01 extends TestBaseBeforeMethodAfterMethod {
    // ...Exercise3...


    @Test
    public void test01() {
        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        //fill the firstname
        Faker faker=new Faker();
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(faker.name().firstName());
        Actions actions=new Actions(driver);
        actions.sendKeys(Keys.TAB).sendKeys(faker.name().lastName())
                .perform();
        //fill the lastname
        //check the gender
        driver.findElement(By.xpath("//input[@id='sex-0']")).click();
        //check the experience
        driver.findElement(By.xpath("//input[@id='exp-2']")).click();
        //fill the date
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("11.11.22");
        //choose your profession -> Automation Tester
        driver.findElement(By.xpath("//*[@id='profession-1']")).click();
        //choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//input[@value='Selenium Webdriver']")).click();
        //choose your continent -> Antartica
//        WebElement dropDownContinent=driver.findElement(By.xpath("//*[@id='continents']"));
//        Select select=new Select(dropDownContinent);
//        select.deselectByVisibleText("Antartica");

        //choose your command  -> Browser Commands
        driver.findElement(By.xpath("//*[@id='selenium_commands']/option[1]")).click();
        //click submit button
        driver.findElement(By.xpath("//*[@id='submit']")).click();


    }
}
