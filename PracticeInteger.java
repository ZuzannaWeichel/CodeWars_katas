package com.zuPadawan;

import java.util.*;
import java.util.stream.IntStream;

public class PracticeInteger {

    public static int[] countPositivesSumNegatives(int[] input) {
        int count = 0;
        int sum = 0;
        if(input==null){
            return new int[0];
        }else if(input.length ==0){
            return new int[0];
        }else{
            for (int i = 0; i < (input.length); i++) {
                if (input[i] > 0) {
                    count++;
                } else {
                    sum += input[i];
                }
            }
            return new int[]{count, sum};
        }
    }

    public static int howOld(final String herOld) {

        return Integer.parseInt(String.valueOf(herOld.charAt(0)));
    }

    public static java.lang.String intToString(int number){

        return Integer.valueOf(number).toString();
    }

    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers){
        List<Integer> toReturn = new ArrayList<>();
        for (int number :listOfNumbers) {
            if(number % 2 == 1){
                toReturn.add(number);
            }
        }
        return toReturn;
    }

    public static String switchItUp(int number){
        switch (number) {
            case 0: return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
        }
        return "Nine";
    }

    public static int noBoringZeros(int n) {
        int count = 0;
        if (String.valueOf(n).isEmpty()) {
            return 0;
        }
        int[]digits = IntStream.of(n).toArray();
        for (int i = digits.length-1; i >0 ; i--) {
            if(digits[i]==0){
               count++;
            }
       }
       return Integer.valueOf(digits.toString().substring(0,digits.length-1-count));
    }

    public static int[] paintLetterboxes(final int start, final int end) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Map<Integer,Integer> counterMap = new TreeMap<Integer,Integer>();
        int [] answer = new int[10];
        for (int i = 0; i <10 ; i++) {
            counterMap.put(i,0);
        }
        for (int i = start; i <= end; i++) {
            String[] num = String.valueOf(i).split("");
            for (String n : num) {
                numbers.add(Integer.parseInt(n));
            }
        }
        for(int i = 0; i<numbers.size();i++){
            if(counterMap.containsKey(numbers.get(i))){
                counterMap.put(numbers.get(i), counterMap.get(numbers.get(i))+1 );
            }
        }

        for (int i = 0; i <answer.length ; i++) {
            answer[i] = (Integer)counterMap.values().toArray()[i];
        }
        return answer;
    }
}
