package practice.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


public class patternCheck2 {

    /**
     * @param args
     */
    public static void main(String[] args) {
//        char chr = 'ã€‚';
//        System.out.println((int)chr);
        
        //Pattern p = Pattern.compile("(?=.{9,})(?=.{1,}[a-z])(?=.{1,}[A-Z])(?=.{1,}[0-9])(?=.{1,}\\p{Punct}).*");
        //Pattern p = Pattern.compile("[[aeiou]&&[^:]]*");
        //Pattern p1 = Pattern.compile("^[0-9A-Za-z_.\\-\\//]+$");
        //Pattern p1 = Pattern.compile("^[`~!@#$%^&*()_+-=\\\\{}|;\':\",./<>?\\s\\[\\]]+$"); // all keyboard inputs
        //Pattern p1 = Pattern.compile("[`~!@#$%^&*()_+-=\\\\{}|;\':\",./<>?\\s\\[\\]]+"); // all keyboard inputs
        //Pattern p1 = Pattern.compile("[0-9]+[A-Za-z]+|[0-9]+[`~!@#$%^&*()_+-=\\\\{}|;\':\",./<>?\\s\\[\\]]+|[A-Za-z]+[`~!@#$%^&*()_+-=\\\\{}|;\':\",./<>?\\s\\[\\]]+");
        //Pattern p1 = Pattern.compile(".*[0-9]+[A-Za-z]+.*|.*[0-9]+[`~!@#$%^&*()_+-=\\\\{}|;\':\",./<>?\\s\\[\\]]+.*|.*[A-Za-z]+[`~!@#$%^&*()_+-=\\\\{}|;\':\",./<>?\\s\\[\\]]+.*|.*[A-Za-z]+[0-9]+.*|.*[`~!@#$%^&*()_+-=\\\\{}|;\':\",./<>?\\s\\[\\]]+[0-9]+.*|.*[`~!@#$%^&*()_+-=\\\\{}|;\':\",./<>?\\s\\[\\]]+[A-Za-z]+.*"); // hcp pwd validation pattern        
        
        // [\\]`~!@#$%^&*()_+=\\\\{}|;\':\",./<>?\\s\\p{L}\\[-]+
        //Works for all except multiByte = ".*[0-9]+[A-Za-z]+.*|.*[0-9]+[\\]`~!@#$%^&*()_+=\\\\{}|;\':\",./<>?\\s\\[-]+.*|.*[A-Za-z]+[\\]`~!@#$%^&*()_+=\\\\{}|;\':\",./<>?\\s\\[-]+.*|.*[A-Za-z]+[0-9]+.*|.*[\\]`~!@#$%^&*()_+=\\\\{}|;\':\",./<>?\\s\\[-]+[0-9]+.*|.*[\\]`~!@#$%^&*()_+=\\\\{}|;\':\",./<>?\\s\\[-]+[A-Za-z]+.*"
        //Trial pattern including multiByte = ".*[0-9]+[A-Za-z]+.*|.*[0-9]+[\\]`~!@#$%^&*()_+=\\\\{}|;\':\",./<>?\\s\\p{L}\\[-]+.*|.*[A-Za-z]+[\\]`~!@#$%^&*()_+=\\\\{}|;\':\",./<>?\\s\\p{L}\\[-]+.*|.*[A-Za-z]+[0-9]+.*|.*[\\]`~!@#$%^&*()_+=\\\\{}|;\':\",./<>?\\s\\p{L}\\[-]+[0-9]+.*|.*[\\]`~!@#$%^&*()_+=\\\\{}|;\':\",./<>?\\s\\p{L}\\[-]+[A-Za-z]+.*"
        
        
        // HCP password validation pattern
        //Pattern p1 = Pattern.compile(".*[0-9]+[A-Za-z]+.*|.*[0-9]+[\\]`~!@#$%^&*()_+=\\\\{}|;\':\",./<>?\\s\\[-]+.*|.*[A-Za-z]+[\\]`~!@#$%^&*()_+=\\\\{}|;\':\",./<>?\\s\\[-]+.*|.*[A-Za-z]+[0-9]+.*|.*[\\]`~!@#$%^&*()_+=\\\\{}|;\':\",./<>?\\s\\[-]+[0-9]+.*|.*[\\]`~!@#$%^&*()_+=\\\\{}|;\':\",./<>?\\s\\[-]+[A-Za-z]+.*"); // hcp pwd validation pattern
        //Pattern p1 = Pattern.compile(".*[\\p{Alpha}]+[\\p{Digit}]+.*|.*[\\p{Alpha}]+[[\\p{Punct}][\\p{Space}]]+.*|.*[\\p{Digit}]+[[\\p{Punct}][\\p{Space}]]+.*|.*[\\p{Digit}]+[\\p{Alpha}]+.*|.*[[\\p{Punct}][\\p{Space}]]+[\\p{Digit}]+.*|.*[[\\p{Punct}][\\p{Space}]]+[\\p{Alpha}]+.*"); // hcp pwd validation pattern

        //".*[\\p{L}]+[\\p{Digit}]+.*|.*[\\p{L}]+[[\\p{Punct}][\\p{Space}]]+.*|.*[\\p{Digit}]+[[\\p{Punct}][\\p{Space}]]+.*|.*[\\p{Digit}]+[\\p{L}]+.*|.*[[\\p{Punct}][\\p{Space}]]+[\\p{Digit}]+.*|.*[[\\p{Punct}][\\p{Space}]]+[\\p{L}]+.*"
        
        //Pattern p1 = Pattern.compile(".*[\\p{L}]+[\\p{Digit}]+.*|.*[\\p{L}]+[[\u0000-\uDBFF\uDFFF] && [^\\p{L}0-9]]+.*|.*[\\p{Digit}]+[[\u0000-\uDBFF\uDFFF] && [^\\p{L}0-9]]+.*|.*[\\p{Digit}]+[\\p{L}]+.*|.*[[\u0000-\uDBFF\uDFFF] && [^\\p{L}0-9]]+[\\p{Digit}]+.*|.*[[\u0000-\uDBFF\uDFFF] && [^\\p{L}0-9]]+[\\p{L}]+.*"); // hcp pwd validation pattern

        //Pattern p1 = Pattern.compile("[\\p{L}]");
        
        //"[[[P]{1}[0-9]{4}[P|T|E|N|M]{1}]{6}[:]{0,1}]*"
        //"[P{1}[0-9]{4}[P|T|E|N|M]{1}[:]{0,1}]*{6,7}"
        //^P[[0-9]{4}[P|T|E|N|M]{1}]{5}$
        //^P[[0-9]{4}[P|T|E|N|M]{1}]{5}+$
        //((P[[0-9]{4}[P|T|E|N|M]{1}]{5})*|([:]{0,1}[P[[0-9]{4}[P|T|E|N|M]{1}]{5}[:]{1}P[[0-9]{4}[P|T|E|N|M]{1}]{5}]{13}))*
        Pattern p1 = Pattern.compile("P[[0-9]{4}[P|T|E|N|M]{1}]{5}(:P[[0-9]{4}[P|T|E|N|M]{1}]{5})*");
        
        //Pattern p1 = Pattern.compile("[[[P]{1}[0-9]{4}[P|T|E|N|M]{1}]{6}[:]{0,1}]*");
        
        //Pattern p1 = Pattern.compile("^[\\x21-\\x7E]+$");
        
        //Pattern p1 = Pattern.compile("[\\p{L}|\\p{Digit}|\\p{Punct}|\\p{Space}].*");
        
        //Pattern p1 = Pattern.compile("^[\u0000-\u0408].*$");
        
        //CIFS ShareName Pattern //f48fbfbf //\uDBFF\uDFFF alias U+10FFFF = "[\u0000-\uDBFF\uDFFF].*"
        //Pattern p1 = Pattern.compile("[\u0000-\uDBFF\uDFFF].*");
        //x30-x39 - numbers
        //x41-x5A - caps
        //x61-x7A - small
        //Pattern p1 = Pattern.compile("[[\u0000-\uDBFF\uDFFF] && [^a-zA-Z0-9]]*"); // hcp pwd validation pattern
        
        List validationList = new ArrayList();
        
        //Special characters
        String[] specialCharacters = {" ", "`", "~", "!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "_", "+", "-", "=", "[", "]", "\\", "{", "}", "|", ";", "'", ":", "\"", ",", ".", "/", "<", ">", "?" }; // all keyboard input array
        
        //Numbers
        String[] numbers = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "0" };
        
        //Alphabets
        String[] alphabets = {"a" , "b" , "c" , "d" , "e" , "f" , "g" , "h" , "i" , "j" , "k" , "l" , "m" , "n" , "o" , "p" , "q" , "r" , "s" , "t" , "u" , "v" , "w" , "x" , "y" , "z" , "A" , "B" , "C" , "D" , "E" , "F" , "G" , "H" , "I" , "J" , "K" , "L" , "M" , "N" , "O" , "P" , "Q" , "R" , "S" , "T" , "U" , "V" , "W" , "X" , "Y" , "Z"};
        
        String[] combination = {"polaris#remote","1234567890", "abcdefghijklmnopqrstuvwxyz", "ABCDEFGHIJKLMNOPQRSTUVWXYZ", "`~!@#$%^&*()_+|-=\\[]{};':\",./<>?","ã‚Šã�Œã�‚ã‚‹ã€‚", "ã‚Šã�Œ  ã�‚ã‚‹ã€‚", " ", "     ", "a1", "h ", "W@", "a s d f", "1 2 3 4","1_2-3#4", "! @ # $ ","[1:2e\"r>", "q1w2e3r4","q.w;e<r/", " QWE \\qwe 123~!@#+_- ","å‡¦ ç�† ãƒ•ãƒ­ãƒ¼ ã�«èª¤ã‚Š ã�Œ ã�‚ ã‚‹ã€‚","123å‡¦ç�†ãƒ•ãƒ­ãƒ¼ã�«èª¤ã‚Šã�Œã�‚ã‚‹ã€‚","å‡¦ç�†ãƒ•ãƒ­ãƒ¼ã�«dfsadfèª¤ã‚Šã�Œã�‚ã‚‹ã€‚","å‡¦ç�†ãƒ•ãƒ­ãƒ¼ã�«3445èª¤ã‚Šã�Œã�‚ã‚‹ã€‚","å‡¦asdfaç�†ãƒ•ãƒ­ãƒ¼454ã�«èª¤ã‚Šã�Œã�‚ã‚‹ã€‚","*&>?<å‡¦$%^$%ç�†ãƒ•ãƒ­ãƒ¼ã�«èª¤ã‚Šã�Œã�‚ã‚‹ã€‚ï½¯*&","å‡¦ç�†ãƒ•ãƒ­        ãƒ¼ã�«èª¤       ã‚Šã�Œã�‚ã‚‹ã€‚","as dfå‡¦ç�†ãƒ•ãƒ­ãƒ¼ã�«èª¤ã‚Šã�Œã�‚ã‚‹ã€‚","qwerty 123","a-ÃƒÂ¢-Ã£Â�â€š-Ã°Â¡Ë†Â½ ","Ã£","Ã£ Ã°","asdfå‡¦ç�†","asdfç•°ã�ªã‚‹ã€‚","ã�‚ã�‚ã�‚","ç•°ã�ª","ç•°","ã�Œ","ã‚Š","ã‚Šã�Œ","aa@Â½âˆŸâ–¼âŒ‚â˜º11",")))*;Ã¯Ã„","Ã§Ã©Ã±123","Ã¢asdfg","Â½âˆŸâ–¼âŒ‚â˜º11","Â½âˆŸâ–¼âŒ‚â˜º","âˆ® âˆ¯ âˆ° âˆ±","âˆ®   âˆ¯   âˆ°   âˆ±","âˆ®âˆ¯âˆ°âˆ±123asdf","Ã„ASdas","Ã¯Ã¯Ã¯Ã¯IF","ã�‚ ã�‚ ã�‚ ","âˆ® âˆ¯ âˆ° âˆ±1","ã�‚ã�‚ã�‚aaa","Ã¢","Ã¯","Ã„"};

        
        String[] myInput = { "P1111P", "P1111T", "P1111E", "P1111M", "P1111N", "P1111A", "P1111Z", "P12345A", "P12345P", "A1111E" ,"","P1111P:","P1111P:P1111M","P1111P*","P1111P::P1111M","B1111P:P1111G","P2N","1234PP","ppsadf","pp1254","pp1254p","p1111m","P1111P:P1111T:P1111E:P1111M:P1111N","P1111P:P1111T:P1111E:P1111M","P1111P:P1111T:P1111E:P1111M::","P1111P:P1111T:P1111E:P111","P1111PP1111P",":P1111P:P1111P"};
        
//        validationList.add(specialCharacters);
//        validationList.add(numbers);
//        validationList.add(alphabets);
//        validationList.add(combination);
        validationList.add(myInput);
        
        int validationListSize = validationList.size();
        for (int i = 0; i < validationListSize; i++) {
            String[] strArray = (String[])validationList.get(i);
            for (String s : strArray) {
                boolean matches = p1.matcher(s).matches();
                System.out.println(s +" >>"+  matches);
            }
        }
        System.out.println("â–¼âŒ‚â˜ºÂ ".length());
        System.out.println("ðŸš€ðŸš€bcc".length());
        System.out.println("ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€ðŸš€a1".length());
    }

}
