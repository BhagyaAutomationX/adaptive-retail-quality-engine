package core;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ConfigReader;

public class DriverManager {

    public static WebDriver browserSession;

    @BeforeMethod
    public void initializeBrowserSession() {

        Properties projectProperties =
                ConfigReader.loadProjectConfigurations();

        String selectedBrowser =
                projectProperties.getProperty("browser");

        if(selectedBrowser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            browserSession = new ChromeDriver();
        }

        else if(selectedBrowser.equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();
            browserSession = new FirefoxDriver();
        }

        else {

            WebDriverManager.edgedriver().setup();
            browserSession = new EdgeDriver();
        }

        browserSession.manage().window().maximize();

        browserSession.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        browserSession.get(
                projectProperties.getProperty("url"));
    }

    @AfterMethod
    public void terminateBrowserSession() {

        if(browserSession != null) {

            browserSession.quit();
        }
    }
}