package practice.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;



public class patternCheck {

    /**
     * @param args
     */
    public static void main(String[] args) {
//        String[] input = {"10h", "2d", "10w", "200m", "10M", "d2", "t10w", "200minutes", "200a"};
//        Pattern p1 = Pattern.compile("[0-9]*[d|h|w|m|M]{1}");
        
        String[] input = {"2027/06/10T00:00:00.000+09:00"};
        Pattern p1 = Pattern.compile("[0-9]{4}/[0-9]{2}/[0-9]{2}T[0-9]{2}:[0-9]{2}:[0-9]{2}.[0-9]{3}");
        Pattern p2 = Pattern.compile("[0-9]{4}/[0-9]{2}/[0-9]{2}T[0-9]{2}:[0-9]{2}:[0-9]{2}.[0-9]{3}[+][0-9]{2}:[0-9]{2}");
        for (int i = 0; i < input.length; i++) {
            String element = input[i];
            boolean matches1 = p1.matcher(element).matches();
            boolean matches2 = p2.matcher(element).matches();
            boolean worngFormat = false;
            if(matches1){
                System.out.println(element +" >> matches1: "+  matches1);
                worngFormat = false;
            } else if(matches2){
                System.out.println(element +" >> matches2: "+  matches2);
                worngFormat = false;
            } else {
                System.out.println(element +" >> true");
                worngFormat = true;
            }
            if(worngFormat){
                System.out.println(element +" >> Failed");
            }
        }
    }

}
