package appiumTests;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yuriyryndin on 11.04.2020
 */
public class functionalityTestPositive extends Main {
    @Test
    public static void testingPlusFunction () throws InterruptedException {
        driver.findElementById("com.android.calculator2:id/digit_1").click();
        driver.findElementById("com.android.calculator2:id/op_add").click();
        driver.findElementById("com.android.calculator2:id/digit_5").click();
        String screenFirstPart = driver.findElementById("com.android.calculator2:id/formula").getText();
        String screenSecondPart = driver.findElementById("com.android.calculator2:id/result").getText();
        Assert.assertEquals(screenFirstPart, "1+5");
        Assert.assertEquals(screenSecondPart, "6");
        driver.findElementById("com.android.calculator2:id/eq").click();
        Thread.sleep(1000);
        String screenAfter = driver.findElementById("com.android.calculator2:id/result").getText();
        Assert.assertEquals(screenAfter, "6");
    }

    @Test
    public static void testingMinusFunction () throws InterruptedException {
        driver.findElementById("com.android.calculator2:id/digit_8").click();
        driver.findElementById("com.android.calculator2:id/op_sub").click();
        driver.findElementById("com.android.calculator2:id/digit_3").click();
        String screenFirstPart = driver.findElementById("com.android.calculator2:id/formula").getText();
        String screenSecondPart = driver.findElementById("com.android.calculator2:id/result").getText();
        Assert.assertEquals(screenFirstPart, "8−3");
        Assert.assertEquals(screenSecondPart, "5");
        driver.findElementById("com.android.calculator2:id/eq").click();
        Thread.sleep(1000);
        String screenAfter = driver.findElementById("com.android.calculator2:id/result").getText();
        Assert.assertEquals(screenAfter, "5");
    }
}
