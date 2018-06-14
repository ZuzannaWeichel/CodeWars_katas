package com.zuPadawan;

import java.lang.reflect.Type;
import java.util.Arrays;

import static java.util.Arrays.*;

public class PracticeArray {

    public static int[] digitize(long n) {
        String s = new StringBuilder().append(n).reverse().toString();
        int[] digitize = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digitize[i] = Character.getNumericValue(s.charAt(i));
        }
        return digitize;

    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum = 0;
//        for (int i = 0; i <arr1.length ; i++) {
//            sum+= arr1[i];
//        }
//        for (int i = 0; i <arr2.length ; i++) {
//            sum+= arr2[i];
//        }
        for (int i : arr1) {
            sum += i;
        }
        for (int i : arr2) {
            sum += i;
        }
        return sum;
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int count = 0;
        if (arrayOfSheeps == null) {
            return 0;
        }
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] == true) {
                count++;
            }
        }
        return count;
    }

    public static double find_average(int[] array) {
        return stream(array).average().orElse(0);
    }

    public static String[] fixTheMeerkat(String[] arr) {
        String t = arr[0];
        arr[0] = arr[2];
        arr[2] = t;
        return arr;
    }

    public static long[] divisibleBy(long[] numbers, long divider) {
        return stream(numbers)
                .filter(i -> (i % divider) == 0)
                .toArray();
    }

    public static int[] invert(int[] array) {
        int[] inverted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            inverted[i] = array[i] * -1;
        }
        return inverted;
    }

    public static int sum(int[] numbers) {
        int sum = 0;
        if (numbers.length < 3) {
            return 0;
        } else {
            sort(numbers);
            for (int i = 1; i < numbers.length - 1; i++) {
                sum += numbers[i];
            }
            return sum;
        }
    }

    public static long stairsIn20(int[][] stairs) {
        long oneYear = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < stairs[i].length; j++) {
                oneYear += stairs[i][j];
            }
        }
        return oneYear * 20;
    }

    public int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public int max(int[] list) {
        Arrays.sort(list);
        return list[list.length];
    }

    public static int suma(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        return (arr.length < 0) ? sum : 0;
    }

    public static int[] monkeyCount(final int n) {
        int[] monkeys = new int[n];
        for (int i = 0; i < n; i++) {
            monkeys[i] = monkeys[i] + 1;
        }
        return monkeys;
        // return IntStream.rangeClosed(1, n).toArray();
    }

    public static String printArray(Object[] array) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < array.length - 1; i++) {
            build.append(array[i] + ",");
        }
        return build.append(array[array.length - 1]).toString();

        // return Arrays.stream(array).map(Object::toString).collect(Collectors.joining(","));
    }

    public static int[] pipeFix(int[] numbers) {
        int length = Math.abs(numbers[0] - numbers[numbers.length - 1]) + 1;
        System.out.println(length);
        int[] fix = new int[length];
        int n = numbers[0];
        fix[0] = numbers[0];
        for (int i = 1; i < length; i++) {
            fix[i] = n;
            n++;
        }
        return fix;

        // return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
    }
}
