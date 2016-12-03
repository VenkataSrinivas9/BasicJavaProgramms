
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
public class StringTOLong {

    /**
     * @param args
     */
    public static void main(String[] args) {
        
        String str = "-";
        try{
            if(str != null && !str.equals("")){
                float floatStr = Float.parseFloat(str);
                str = String.format("%.3f", floatStr);
                System.out.println(str);
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println(str);
    }

}

