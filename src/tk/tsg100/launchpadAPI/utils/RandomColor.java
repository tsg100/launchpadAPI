package tk.tsg100.launchpadAPI.utils;

import tk.tsg100.launchpadAPI.Color;

import java.util.Random;

public class RandomColor {


    public static Color getRandomColor(){
        Color color;

        Random random = new Random();
        int i = random.nextInt(3);

        switch(i){
            case(0):
                color = Color.RED;
                break;
            case(1):
                color = Color.AMBER;
                break;
            case(2):
                color = Color.GREEN;
                break;
            default:
                color = Color.BLANK;
                break;
        }




        return color;
    }

}
