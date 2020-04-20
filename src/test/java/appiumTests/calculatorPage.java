package appiumTests;

import io.appium.java_client.MobileElement;

import static appiumTests.Main.driver;

/**
 * Created by iuriiryndin on 20.04.2020
 */
public class calculatorPage {
    public static MobileElement buttonOne = driver.findElementById("com.android.calculator2:id/digit_1");
    public static MobileElement buttonTwo = driver.findElementById("com.android.calculator2:id/digit_2");
    public static MobileElement buttonThree = driver.findElementById("com.android.calculator2:id/digit_3");
    public static MobileElement buttonFour = driver.findElementById("com.android.calculator2:id/digit_4");
    public static MobileElement buttonFive  = driver.findElementById("com.android.calculator2:id/digit_5");
    public static MobileElement buttonSix = driver.findElementById("com.android.calculator2:id/digit_6");
    public static MobileElement buttonSeven = driver.findElementById("com.android.calculator2:id/digit_7");
    public static MobileElement buttonEight = driver.findElementById("com.android.calculator2:id/digit_8");
    public static MobileElement buttonNine = driver.findElementById("com.android.calculator2:id/digit_9");
    public static MobileElement buttonZero = driver.findElementById("com.android.calculator2:id/digit_0");
    public static MobileElement buttonPoint = driver.findElementById("com.android.calculator2:id/dec_point");

    public static MobileElement buttonAdd = driver.findElementById("com.android.calculator2:id/op_add");
    public static MobileElement buttonSub = driver.findElementById("com.android.calculator2:id/op_sub");
    public static MobileElement buttonMul = driver.findElementById("com.android.calculator2:id/op_mul");
    public static MobileElement buttonDiv = driver.findElementById("com.android.calculator2:id/op_div");

    public static MobileElement buttonEqual = driver.findElementById("com.android.calculator2:id/eq");

    public static MobileElement screenFormula = driver.findElementById("com.android.calculator2:id/formula");
    public static MobileElement screenResult = driver.findElementById("com.android.calculator2:id/result");
}
