package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import core.DriverManager;
import listeners.RetryHandler;
import pages.AuthenticationPage;
import pages.DashboardPage;

public class AuthenticationWorkflowTest
extends DriverManager {

    @Test(retryAnalyzer = RetryHandler.class)
    public void validateEmployeeAuthenticationWorkflow() {

        AuthenticationPage authenticationPage =
                new AuthenticationPage(browserSession);

        authenticationPage.authenticateEmployeeAccess(
                "Admin",
                "admin123");

        DashboardPage dashboardPage =
                new DashboardPage(browserSession);

        Assert.assertTrue(
                dashboardPage
                .validateDashboardAvailability());

        System.out.println(
                "Employee authentication workflow validated successfully");
    }
}