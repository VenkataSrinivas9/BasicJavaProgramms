
/*****************************************************************************/
/*      SCI                                                                  */
/*      All Rights Reserved. Copyright (C) 2008, Hitachi, Ltd.               */
/*      Licensed Material of Hitachi, Ltd.                                   */
/*      Reproduction, use, modification or disclosure otherwise than         */
/*      permitted in the License Agreement is strictly prohibited.           */
/*****************************************************************************/ 

package practice.projects.example;

/**
 * 
 */
public class StringToString {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        if(s1 == s2){
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }
        String s3 = new String("Hello");
        String s4 = new String("Hello");
        if(s1 == s3){
            System.out.println("S1 == S3");
        } else {
            System.out.println("S1 != S3");
        }
        s4 = s3.intern();
        if(s1 == s4){
            System.out.println("S1 == S4");
        } else {
            System.out.println("S1 != S4");
        }
        if(s1 == s3){
            System.out.println("S1 == S3");
        } else {
            System.out.println("S1 != S3");
        }
        
    }
}

