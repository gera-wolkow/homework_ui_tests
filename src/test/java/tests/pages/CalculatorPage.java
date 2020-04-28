package tests.pages;

import io.appium.java_client.MobileElement;
import tests.Main;

/**
 * Created by iuriiryndin on 20.04.2020
 */
public class CalculatorPage extends Main {
    public static final MobileElement BUTTON_ONE = driver.findElementById("com.android.calculator2:id/digit_1");
    public static final MobileElement BUTTON_TWO = driver.findElementById("com.android.calculator2:id/digit_2");
    public static final MobileElement BUTTON_THREE = driver.findElementById("com.android.calculator2:id/digit_3");
    public static final MobileElement BUTTON_FOUR = driver.findElementById("com.android.calculator2:id/digit_4");
    public static final MobileElement BUTTON_FIVE = driver.findElementById("com.android.calculator2:id/digit_5");
    public static final MobileElement BUTTON_SIX = driver.findElementById("com.android.calculator2:id/digit_6");
    public static final MobileElement BUTTON_SEVEN = driver.findElementById("com.android.calculator2:id/digit_7");
    public static final MobileElement BUTTON_EIGHT = driver.findElementById("com.android.calculator2:id/digit_8");
    public static final MobileElement BUTTON_NINE = driver.findElementById("com.android.calculator2:id/digit_9");
    public static final MobileElement BUTTON_ZERO = driver.findElementById("com.android.calculator2:id/digit_0");
    public static final MobileElement BUTTON_POINT = driver.findElementById("com.android.calculator2:id/dec_point");

    public static final MobileElement BUTTON_ADD = driver.findElementById("com.android.calculator2:id/op_add");
    public static final MobileElement BUTTON_SUB = driver.findElementById("com.android.calculator2:id/op_sub");
    public static final MobileElement BUTTON_MUL = driver.findElementById("com.android.calculator2:id/op_mul");
    public static final MobileElement BUTTON_DIV = driver.findElementById("com.android.calculator2:id/op_div");

    public static final MobileElement BUTTON_EQUAL = driver.findElementById("com.android.calculator2:id/eq");

    public static final MobileElement SCREEN_FORMULA = driver.findElementById("com.android.calculator2:id/formula");
    public static final MobileElement SCREEN_RESULT = driver.findElementById("com.android.calculator2:id/result");
}
