package com.zuPadawan;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Arrays;

public class PracticeMath {

    public static int nearestSq(int n) {

        int i = (int) Math.sqrt(n);
        int result1 = (int) Math.pow(i,2);
        int result2 = (int) Math.pow(i+1,2);
        if(Math.abs(n-result1)>Math.abs(n-result2)){
            return result2;
        }else{
            return result1;
        }
    }

    public static Integer basicMath(String op, int v1, int v2){
        Integer number=0;
        if(op.equals("+")){
            number= v1+v2;
        }
        if(op.equals("-")){
            number= v1-v2;
        }
        if(op.equals("*")){
            number = v1*v2;
        }
        if(op.equals("/")){
            number= v1/v2;
        }
        return number;
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int i = 0; i <classPoints.length ; i++) {
            sum+=classPoints[i];
        }
        return sum / classPoints.length < yourPoints;
    }

    public static String bonusTime(final int salary, final boolean bonus) {
        int yourPay =0;
        if(bonus) yourPay = salary * 10;
        return  "\u00A3"+yourPay;
    }

    public class Polygon {
        int sides;
        int sideLength;

        public Polygon(int sides, int sideLength) {
            this.sides = sides;
            this.sideLength = sideLength;
        }

        public double circleDiameter() {
            return sideLength / (2 * Math.tan(Math.PI / sides));

        }
    }

    public static int pythagoreanTriple(int[] triple){
        Arrays.sort(triple);
        if(Math.pow(triple[2],2)== Math.pow(triple[1],2)+ Math.pow(triple[0],2)){
            return 1;
        }
        return 0;
    }

    public static double find_average(int[] array){
        return Arrays.stream(array).average().orElse(0);
    }

    public static long[] divisibleBy(long[] numbers, long divider) {
        return Arrays.stream(numbers)
                .filter(i -> (i % divider) == 0)
                .toArray();
    }

    public static int nthPower(int[] array, int n) {

        return n < array.length ? (int)Math.pow(array[n],n) :  -1;
    }

    public static Integer calculateTip(double amount, String rating) {
       double tip;
        if  (rating.equalsIgnoreCase("Terrible")){ tip = 0;
        }else if (rating.equalsIgnoreCase("Poor")){tip = 0.05;
        }else if (rating.equalsIgnoreCase("Good")){tip =0.1;
        }else if (rating.equalsIgnoreCase("Great")){tip = 0.15;
        }else if (rating.equalsIgnoreCase("Excellent")){tip = 0.2;
        }else{
            return null;
        }

        return (int)(Math.round(amount*tip+1));
    }

    public static int[] squareOrSquareRoot(int[] array) {
            int [] toReturn = new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            int n = array[i];
            if(Math.sqrt(n) == (int)Math.sqrt(n)){
                 toReturn[i] = (int) Math.sqrt(n);
            }else{
                toReturn[i] =(int) Math.pow(n,2);
            }
        }

        return toReturn;
    }

    public static double TwoDecimalPlaces(double number){
       return Math.round(number * 100.0) / 100.0;
    }

//    public int compareTo(Student a){
//        if(this.cgpa=a.getCgpa()){
//            if(this.fname.equals(a.getName)){
//                if(this.id > a.getId()){
//                    return -1;
//                }else{
//                    return 1;
//                }
//            }else{
//                return this.name.compareToIgnoreCase(a.getName));
//            }
//        }else if (this.cgpa > a.getCgpa()){
//            return -1;
//        }else{
//            return 1;
//        }
//    }
    }
