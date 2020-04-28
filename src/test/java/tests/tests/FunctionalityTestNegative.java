package tests.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.Main;
import tests.pages.CalculatorPage;

/**
 * Created by yuriyryndin on 11.04.2020
 */
public class FunctionalityTestNegative extends Main {
    @Test
    public static void testingDividingByZero () throws InterruptedException {
        CalculatorPage.BUTTON_SIX.click();
        CalculatorPage.BUTTON_DIV.click();
        CalculatorPage.BUTTON_ZERO.click();
        CalculatorPage.BUTTON_EQUAL.click();
        Thread.sleep(1000);
        String screenAfter = CalculatorPage.SCREEN_RESULT.getText();
        Assert.assertEquals(screenAfter, "Can't divide by 0");
    }

    @Test
    public static void testingSeveralPoints () throws InterruptedException {
        int n = 0;
        CalculatorPage.BUTTON_FIVE.click();
        while (n <20) {
            CalculatorPage.BUTTON_POINT.click();
            n++;
        }
        CalculatorPage.BUTTON_THREE.click();
        String screenFirstPart = CalculatorPage.SCREEN_FORMULA.getText();
        Assert.assertEquals(screenFirstPart, "5.3");
    }
}
