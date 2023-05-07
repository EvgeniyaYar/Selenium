import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ApplicationDebitCardTest {
    private WebDriver driver;
    @BeforeAll
        static void setUpAll() {
        System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
    }

    @BeforeEach
        void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--no-sandbox");
        options.addArguments("--headless");
        driver = new ChromeDriver(options);

    }

    @AfterEach
            void tearDown() {
        driver.quit();
        driver = null;
    }


}