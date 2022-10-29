package utilities;

import org.testng.annotations.Test;

public class TestBaseRaporSablon extends TestBaseRapor{
    @Test
    public void test01() {
        extentTest = extentReports.createTest("test01", "Web automation");

        //
        //

        extentTest.info("   // 1.       \n" +"//2.    ");
        //
        //

        extentTest.info("   // 3.       \n" +"//4.    ");
        //
        //

        extentTest.info("   // 5.       \n" +"//6.    ");
        //
        //

        extentTest.info("   // 7.       \n" +"//8.    ");
        //
        //

        extentTest.info("   // 9.       \n" +"//10.    ");
        //
        //

        extentTest.info(" ");
        //
        //

        extentTest.pass("Aramayla ilgili ürünün (\"blue top\") görünür olduğu doğrulandı");

        //target-->rapor-->sag click-->open in-->browser-->görüntüle

    }
}
