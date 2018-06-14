package com.zuPadawan;

public class PracticeBoolean {

    public static String convert(boolean b) {
        if (b) {
            return "true";
        } else {
            return "false";
        }
    }

    public static boolean xor(boolean a, boolean b) {
//        if ((a && b) || (!a && !b)) {
//            return false;
//        } else {
//            return true;
//        }

        return a^b;
    }

    public static boolean isPlural(float f) {
        return (f > 1);
    }
}