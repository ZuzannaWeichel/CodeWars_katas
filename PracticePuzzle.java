package com.zuPadawan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Integer.valueOf;

public class PracticePuzzle {

    public static int nthEven(int n) {
        int even = 0;
        for (int i = 0; i <=n ; i++) {
            even+=2;
        }
        return even;
    }

    public static int enough(int cap, int on, int wait){

        return (on+wait <= cap)?(0):(on+wait-cap);
    }

    public int cockroachSpeed(double x){

        return (int) (x * 0.28);
    }

    public static String rps(String p1, String p2) {//ROCK, PAPER, SCISSORS
        if(p1 == p2){
            return "Draw!";
        }else if(p1 == "scissors" && p2 == "paper"||
                p1 == "paper"&& p2 == "rock" ||
                p1 == "rock" && p2 == "scissors"){
            return "Player 1 won!";
        }
        return "Player 2 won!";
    }

    public static String howMuchILoveYou(int nb_petals) {
        if (nb_petals%6 == 1){
            return "I love you";
        }
        if (nb_petals%6 == 2){
            return "a little";
        }
        if (nb_petals%6 == 3){
            return "a lot";
        }
        if (nb_petals%6 == 4){
            return "passionately";
        }
        if (nb_petals%6 == 5){
            return "madly";
        }
        if (nb_petals%6 == 0){
            return "not at all";
        }
        return "";
    }

    static Integer find(final int[] array) {
        int number = array[0];
        for (int i = 1; i <array.length ; i++) {
            if(number+1 != array[i]){
                return valueOf(array[i])+1;
            }
        }
        return null;
    }

    public static String CalculateAge(int birth, int yearTo) {
        int years = Math.abs(birth - yearTo);
        if (years > 1) {
            if (birth < yearTo) {
                return "You are " + years + " years old";
            } else {
                return "You will be born in " + years + " years.";
            }
        } else if (years == 1) {
            if (birth < yearTo) {
                return "You are 1 year old";
            } else {
                return "You will be born in 1 year.";
            }
        } else {
            return "You were born this very year!";
        }
    }

    public static String updateLight(String current) {
//       String light = "";
//        if(current.equals("green")){
//            light ="yellow";
//        }
//        if(current.equals("yellow")){
//            light ="red";
//        }
//        if(current.equals("red")){
//            light ="green";
//        }
//        return light;

        return current.equals("red") ? "green" : current.equals("green") ? "yellow" : "red";
    }

    public static String position(char alphabet) {
        return "Position of alphabet: "+((int)alphabet-96);
    }

    public static int findLongest(final String str) {
        String[] spl = str.split(" ");
        int longest = 0;
        for (int i=0; i<spl.length; i++) {
            if (spl[i].length() > longest) {
                longest = spl[i].length();
            }
        }
        return longest;
    }

    public static int toBinary(int n) {

       return Integer.parseInt(Integer.toBinaryString(n));
    }

    public static String whatIs(Integer x) {
        for (Object[] p : specialNumbers) {
            if (p[0] == x)
                return (String)p[0];
        }
        return "nothing";
    }

    static final Object[][] specialNumbers = {
            {42, "everything"},
            {42 * 42, "everything squared"}
    };
}
