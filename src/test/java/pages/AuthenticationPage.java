package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage {

    WebDriver browserSession;

    public AuthenticationPage(WebDriver browserSession) {

        this.browserSession = browserSession;
    }

    By employeeUsernameField =
            By.name("username");

    By employeePasswordField =
            By.name("password");

    By authenticationButton =
            By.xpath("//button[@type='submit']");

    By invalidCredentialsMessage =
    		By.cssSelector(".oxd-alert-content-text");

    public void authenticateEmployeeAccess(
            String employeeId,
            String employeePassword) {

        browserSession.findElement(employeeUsernameField)
                .sendKeys(employeeId);

        browserSession.findElement(employeePasswordField)
                .sendKeys(employeePassword);

        browserSession.findElement(authenticationButton)
                .click();
    }

    public boolean verifyInvalidAuthenticationMessage() {

        return browserSession.findElement(
                invalidCredentialsMessage)
                .isDisplayed();
    }
}