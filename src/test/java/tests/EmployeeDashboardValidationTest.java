package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import core.DriverManager;
import pages.AuthenticationPage;
import pages.DashboardPage;

public class EmployeeDashboardValidationTest
extends DriverManager {

    @Test
    public void validateEmployeeDashboardAccessibility() {

        AuthenticationPage authenticationPage =
                new AuthenticationPage(browserSession);

        authenticationPage.authenticateEmployeeAccess(
                "Admin",
                "admin123");

        DashboardPage dashboardPage =
                new DashboardPage(browserSession);

        boolean dashboardAvailabilityStatus =
                dashboardPage
                .validateDashboardAvailability();

        Assert.assertEquals(
                dashboardAvailabilityStatus,
                true);

        System.out.println(
                "Employee dashboard accessibility validated");
    }
}