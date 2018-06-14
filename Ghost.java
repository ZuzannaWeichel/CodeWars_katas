package com.zuPadawan;

import java.util.Random;

public class Ghost {

        private String color;
        private Random random;
        public Ghost(){
            this.random = new Random();
            this.color = "white";
        }

        public String getColor(){
           int i = random.nextInt(4);
           String[] colors = new String[]{"white","yellow","purple","red"};
            return colors[i];
        }

}
