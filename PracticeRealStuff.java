package com.zuPadawan;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class PracticeRealStuff {

    public static String bmi(double weight, double height) {
        double bmi = Math.pow(height,2)/weight;
        if (bmi <= 18.5){
            return "Underweight";
        }
        if (bmi <= 25.0){
            return "Normal";
        }
        if (bmi <= 30.0){
            return "Overweight";
        }
        if (bmi > 30){
            return "Obese";
        }
        return "";
    }

    public static String greet(String language){
        Map<String, String> list = new HashMap<>();
        list.put("english","Welcome");
        list.put("czech", "Vitejte");
        list.put("danish","Velkomst");
        list.put("dutch","Welkom");
        list.put("estonian","Tere tulemast");
        list.put("finnish","Tervetuloa");
        list.put("flemish", "Welgekomen");
        list.put("french", "Bienvenue");
        list.put("german","Willkommen");
        list.put("irish" ,"Failte");
        list.put("italian", "Benvenuto");
        list.put("latvian","Gaidits");
        list.put("lithuanian","Laukiamas");
        list.put("polish", "Witamy");
        list.put("spanish", "Bienvenido");
        list.put("swedish", "Valkommen");
        list.put("welsh" ,"Croeso");

        if (list.containsKey(language)){
            return list.get(language);
        }else{
            return "Welcome";
        }
    }

    public int rentalCarCost(int d) {
    int total = 0 ;
     if(d<3){
        total = d*40;
     }else if (d>2&&d<7){
        total = d*40 - 20;
     }else{
        total =d*40 - 40;
     }
    return total;
    }

    public static double fuelPrice(int litres, double pricePerLiter) {
        double total = 0;
        if(litres<2){
            total = litres*pricePerLiter;
        }else if(litres>=2 && litres<4){
            total =(pricePerLiter - 0.05)*litres;
        }else if(litres>=4 && litres<6){
            total =(pricePerLiter -0.10)*litres;
        }else if(litres>=6 && litres<8){
            total =(pricePerLiter -0.15)*litres;
        }else if(litres>=8 && litres<10) {
            total =(pricePerLiter - 0.20)*litres;
        }else if(litres>=10){
            total =(pricePerLiter - 0.25)*litres;
        }

        return Math.ceil(total);
    }

    public static String getDay(String day, String month, String year) {
        Calendar c = Calendar.getInstance();
        c.set(Integer.valueOf(year),Integer.valueOf(month),Integer.valueOf(day));
        String [] days = new String[]{"","THURSDAY","FRIDAY","SATURDAY","SUNDAY","MONDAY","TUESDAY","WEDNESDAY"};
        return days[c.get(Calendar.DAY_OF_WEEK)];
    }
}
