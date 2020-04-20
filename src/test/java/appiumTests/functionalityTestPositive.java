package appiumTests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yuriyryndin on 11.04.2020
 */
public class functionalityTestPositive extends Main {
    @Test
    public static void testingPlusFunction () throws InterruptedException {
        calculatorPage.buttonOne.click();
        calculatorPage.buttonAdd.click();
        calculatorPage.buttonFive.click();
        String screenFirstPart = calculatorPage.screenFormula.getText();
        String screenSecondPart = calculatorPage.screenResult.getText();
        Assert.assertEquals(screenFirstPart, "1+5");
        Assert.assertEquals(screenSecondPart, "6");
        calculatorPage.buttonEqual.click();
        Thread.sleep(1000);
        String screenAfter = calculatorPage.screenResult.getText();
        Assert.assertEquals(screenAfter, "6");
    }

    @Test
    public static void testingMinusFunction () throws InterruptedException {
        calculatorPage.buttonEight.click();
        calculatorPage.buttonSub.click();
        calculatorPage.buttonThree.click();
        String screenFirstPart = calculatorPage.screenFormula.getText();
        String screenSecondPart = calculatorPage.screenResult.getText();
        Assert.assertEquals(screenFirstPart, "8−3");
        Assert.assertEquals(screenSecondPart, "5");
        calculatorPage.buttonEqual.click();
        Thread.sleep(1000);
        String screenAfter = calculatorPage.screenResult.getText();
        Assert.assertEquals(screenAfter, "5");
    }

    @Test
    public static void testingMultiplicationFunction () throws InterruptedException {
        calculatorPage.buttonTwo.click();
        calculatorPage.buttonMul.click();
        calculatorPage.buttonFour.click();
        String screenFirstPart = calculatorPage.screenFormula.getText();
        String screenSecondPart = calculatorPage.screenResult.getText();
        Assert.assertEquals(screenFirstPart, "2×4");
        Assert.assertEquals(screenSecondPart, "8");
        calculatorPage.buttonEqual.click();
        Thread.sleep(1000);
        String screenAfter = calculatorPage.screenResult.getText();
        Assert.assertEquals(screenAfter, "8");
    }

    @Test
    public static void testingDivisionFunction () throws InterruptedException {
        calculatorPage.buttonSix.click();
        calculatorPage.buttonDiv.click();
        calculatorPage.buttonThree.click();
        String screenFirstPart = calculatorPage.screenFormula.getText();
        String screenSecondPart = calculatorPage.screenResult.getText();
        Assert.assertEquals(screenFirstPart, "6÷3");
        Assert.assertEquals(screenSecondPart, "2");
        calculatorPage.buttonEqual.click();
        Thread.sleep(1000);
        String screenAfter = calculatorPage.screenResult.getText();
        Assert.assertEquals(screenAfter, "2");
    }
}
