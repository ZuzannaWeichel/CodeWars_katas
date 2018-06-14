package com.zuPadawan;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class PracticeString {

    public static String chromosomeCheck(String sperm) {
        if (sperm.contains("Y")) {
            return "Congratulations! You're going to have a son.";
        } else {
            return "Congratulations! You're going to have a daughter.";
        }
    }

    public static String findNeedle(Object[] haystack) {
        int position = 0;
        for (int i = 0; i < (haystack.length); i++) {
            if (haystack[i] == ("needle")) {
                position = i;
            }
        }
        return "found the needle at position " + position;
    }

    public static String repeatStr(final int repeat, final String string) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            build.append(string);
        }
        return build.toString();
    }

    static String toCamelCase(String s) {
        String[] words = s.replace('_', '-').split("-");
        StringBuilder build = new StringBuilder(words[0]);
        for (int i = 1; i < words.length; i++) {

            build.append(words[i].substring(0, 1).toUpperCase());
            build.append(words[i].substring(1).toLowerCase());
        }
        return build.toString();
    }

    public static List<String> sort(List<String> textbooks) {
        Collections.sort(textbooks, String.CASE_INSENSITIVE_ORDER);

        return textbooks;
    }

    public static String HQ9(char code) {
        if (code == 'H') {
            return "Hello World!";
        }
        if (code == 'Q') {
            return String.valueOf(code);
        }
        if (code == '9') {
            return song();
        }
        return null;
    }

    public static String song() {
        StringBuilder build = new StringBuilder("99 bottles of beer on the wall, 99 bottles of beer.");
        for (int i = 98; i > 0; i--) {
            build.append("Take one down and pass it around, " + i + " bottles of beer on the wall.\n" +
                    i + " bottles of beer on the wall, " + i + " bottles of beer.");
        }
        build.append("Take one down and pass it around, no more bottles of beer on the wall.\n" +
                "No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.");
        return build.toString();
    }

    public static String smash(String... words) {
        return String.join(" ", words);

    }

    public static String sayHello(String[] name, String city, String state) {

        return "Hello " + String.join(" ", name) + "! Welcome to " + city + ", " + state + "!";
    }

    public static java.lang.String intToaString(int number) {

        return Integer.valueOf(number).toString();
    }

    public static java.lang.String repeatString(final Object toRepeat, final int n) {
        StringBuilder build = new StringBuilder();
        if (toRepeat.getClass() != String.class) {
            return "Not a string";
        }
        for (int i = 0; i < n; i++) {
            build.append(toRepeat);
        }
        return build.toString();
    }

    public static String tripleTrouble(String one, String two, String three) {
        StringBuilder build = new StringBuilder();
        for (int i = 0; i < one.length(); i++) {
            build.append(one.charAt(i))
                    .append(two.charAt(i))
                    .append(three.charAt(i));
        }
        return build.toString();
    }

    public static String replaceDots(String str) {
        return str.replace(".", "-");
    }

    public static String toAlternativeString(String string) {
        StringBuilder word = new StringBuilder();
        String upperCase = string.toUpperCase();
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            if (Character.isLowerCase(string.charAt(i))) {
                word.append(upperCase.charAt(i));
            } else {
                word.append(lowerCase.charAt(i));
            }
        }

        return word.toString();
    }

    public static boolean isDigit(String s) {
        return s.matches("[0-9]");
    }

    public String dnaToRna(String dna) {
        return dna.replace('T', 'U');
    }

    public static int stringToNumber(String str) {
        return Integer.valueOf(str);
    }

    public static String buildString(String... args) {
        StringBuilder build = new StringBuilder("I like ");
        for (int i = 0; i < args.length - 1; i++) {
            build.append(args[i] + ", ");
        }
        return build.append(args[args.length] + "!").toString();

        //  return "I like " + String.join(", ", args) + "!";
    }


    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        ArrayList<String> substrings = new ArrayList<>();
        for (int i = 0; i + k <= s.length(); i++) {
            substrings.add(s.substring(i, i + k));
        }
        Collections.sort(substrings);

        return substrings.get(0) + "\n" + substrings.get(substrings.size());
    }

    public static String palindrome() {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        for (int i = 0, y = A.length()-1; i < (A.length()-1)/ 2 && y > (A.length()-1)/ 2; i++, y--) {
            if (A.charAt(i) == A.charAt(y)) {
                return "Yes";
            }
        }
        return "No";

    }

}

