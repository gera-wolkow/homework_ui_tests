package appiumTests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yuriyryndin on 11.04.2020
 */
public class functionalityTestNegative  extends Main {
    @Test
    public static void testingDividingByZero () throws InterruptedException {
        calculatorPage.buttonSix.click();
        calculatorPage.buttonDiv.click();
        calculatorPage.buttonZero.click();
        calculatorPage.buttonEqual.click();
        Thread.sleep(1000);
        String screenAfter = calculatorPage.screenResult.getText();
        Assert.assertEquals(screenAfter, "Can't divide by 0");
    }

    @Test
    public static void testingSeveralPoints () throws InterruptedException {
        int n = 0;
        calculatorPage.buttonFive.click();
        while (n <20) {
            calculatorPage.buttonPoint.click();
            n++;
        }
        calculatorPage.buttonThree.click();
        String screenFirstPart = calculatorPage.screenFormula.getText();
        Assert.assertEquals(screenFirstPart, "5.3");
    }
}
