package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import core.DriverManager;
import pages.AuthenticationPage;

public class InvalidLoginValidationTest
extends DriverManager {

    @Test
    public void validateInvalidAuthenticationHandling() {

        AuthenticationPage authenticationPage =
                new AuthenticationPage(browserSession);

        authenticationPage.authenticateEmployeeAccess(
                "InvalidUser",
                "InvalidPassword");

        Assert.assertTrue(
                authenticationPage
                .verifyInvalidAuthenticationMessage());

        System.out.println(
                "Invalid authentication workflow validated successfully");
    }
}