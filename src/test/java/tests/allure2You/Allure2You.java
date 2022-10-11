package tests.allure2You;

import org.testng.annotations.Test;
import pages.Allure2YouPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Allure2You {
    Allure2YouPage allure2You=new Allure2YouPage();

    @Test
    public void test01() {
        Driver.getDriver().get("https://allure2you.com/");
        allure2You.MyAccount.click();


    }
}
