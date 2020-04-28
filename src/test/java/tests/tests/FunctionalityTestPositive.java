package tests.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.Main;
import tests.pages.CalculatorPage;

/**
 * Created by yuriyryndin on 11.04.2020
 */
public class FunctionalityTestPositive extends Main {
    @Test
    public static void testingPlusFunction () throws InterruptedException {
        CalculatorPage.BUTTON_ONE.click();
        CalculatorPage.BUTTON_ADD.click();
        CalculatorPage.BUTTON_FIVE.click();
        String screenFirstPart = CalculatorPage.SCREEN_FORMULA.getText();
        String screenSecondPart = CalculatorPage.SCREEN_RESULT.getText();
        Assert.assertEquals(screenFirstPart, "1+5");
        Assert.assertEquals(screenSecondPart, "6");
        CalculatorPage.BUTTON_EQUAL.click();
        Thread.sleep(1000);
        String screenAfter = CalculatorPage.SCREEN_RESULT.getText();
        Assert.assertEquals(screenAfter, "6");
    }

    @Test
    public static void testingMinusFunction () throws InterruptedException {
        CalculatorPage.BUTTON_EIGHT.click();
        CalculatorPage.BUTTON_SUB.click();
        CalculatorPage.BUTTON_THREE.click();
        String screenFirstPart = CalculatorPage.SCREEN_FORMULA.getText();
        String screenSecondPart = CalculatorPage.SCREEN_RESULT.getText();
        Assert.assertEquals(screenFirstPart, "8−3");
        Assert.assertEquals(screenSecondPart, "5");
        CalculatorPage.BUTTON_EQUAL.click();
        Thread.sleep(1000);
        String screenAfter = CalculatorPage.SCREEN_RESULT.getText();
        Assert.assertEquals(screenAfter, "5");
    }

    @Test
    public static void testingMultiplicationFunction () throws InterruptedException {
        CalculatorPage.BUTTON_TWO.click();
        CalculatorPage.BUTTON_MUL.click();
        CalculatorPage.BUTTON_FOUR.click();
        String screenFirstPart = CalculatorPage.SCREEN_FORMULA.getText();
        String screenSecondPart = CalculatorPage.SCREEN_RESULT.getText();
        Assert.assertEquals(screenFirstPart, "2×4");
        Assert.assertEquals(screenSecondPart, "8");
        CalculatorPage.BUTTON_EQUAL.click();
        Thread.sleep(1000);
        String screenAfter = CalculatorPage.SCREEN_RESULT.getText();
        Assert.assertEquals(screenAfter, "8");
    }

    @Test
    public static void testingDivisionFunction () throws InterruptedException {
        CalculatorPage.BUTTON_SIX.click();
        CalculatorPage.BUTTON_DIV.click();
        CalculatorPage.BUTTON_THREE.click();
        String screenFirstPart = CalculatorPage.SCREEN_FORMULA.getText();
        String screenSecondPart = CalculatorPage.SCREEN_RESULT.getText();
        Assert.assertEquals(screenFirstPart, "6÷3");
        Assert.assertEquals(screenSecondPart, "2");
        CalculatorPage.BUTTON_EQUAL.click();
        Thread.sleep(1000);
        String screenAfter = CalculatorPage.SCREEN_RESULT.getText();
        Assert.assertEquals(screenAfter, "2");
    }
}
