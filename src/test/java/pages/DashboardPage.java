package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage {

    WebDriver browserSession;

    public DashboardPage(WebDriver browserSession) {

        this.browserSession = browserSession;
    }

    By dashboardVisibilityLocator =
            By.xpath("//h6[text()='Dashboard']");

    public boolean validateDashboardAvailability() {

        return browserSession.findElement(
                dashboardVisibilityLocator)
                .isDisplayed();
    }
}