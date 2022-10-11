package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public abstract class TestBaseBeforeMethodAfterMethod {
    protected WebDriver driver;
    protected String tarih;
    // TestNG framework'unde @Before ve @After notasyonları yerine @BeforeMethod ve @AfterMethod kullanılır
    //Çalışma prensibi JUnit deki Before,After ile aynıdır
    @BeforeMethod(groups = "gp1")
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("YYMMddHHmmss");
        tarih = date.format(formater);
    }
    @Parameters("browser")
    @BeforeClass
    public void setUp(@Optional String browser) {

        driver = Driver.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @AfterMethod(groups = "gp1")
    public void tearDown() {
       // driver.quit();
    }
}
