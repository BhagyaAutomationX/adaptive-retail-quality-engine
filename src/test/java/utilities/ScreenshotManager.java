package utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreenshotManager {

    public static void captureExecutionEvidence(
            WebDriver browserSession,
            String screenshotName) {

        try {

            TakesScreenshot screenshotReference =
                    (TakesScreenshot) browserSession;

            File sourceImage =
                    screenshotReference.getScreenshotAs(
                    OutputType.FILE);

            File destinationImage =
                    new File("./ExecutionScreenshots/"
                    + screenshotName + ".png");

            FileUtils.copyFile(sourceImage,
                    destinationImage);
        }

        catch(Exception exceptionObject) {

            System.out.println(exceptionObject);
        }
    }
}