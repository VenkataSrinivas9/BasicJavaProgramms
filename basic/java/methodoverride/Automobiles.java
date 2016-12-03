/*****************************************************************************/
/* SCI */
/* All Rights Reserved. Copyright (C) 2008, Hitachi, Ltd. */
/* Licensed Material of Hitachi, Ltd. */
/* Reproduction, use, modification or disclosure otherwise than */
/* permitted in the License Agreement is strictly prohibited. */
/*****************************************************************************/

package basic.java.methodoverride;

/**
 * 
 */
public class Automobiles {

    private static String audiPrice;

    private static String bmwPrice;

    private String suzukiPrice;

    private String maruthiPrice;

    protected static void audi() {
        audiPrice = "35lakhs";
        System.out.println(audiPrice);
    }
    
    protected String  BMW() {
        bmwPrice = "25lakhs";
        System.out.println(bmwPrice);
        return bmwPrice;
    }

    protected String suzuki() {
        suzukiPrice = "15lakhs";
        System.out.println(suzukiPrice);
        return suzukiPrice;
    }
    
    

    protected String maruthi(String maruthiPrice1) {
        maruthiPrice = maruthiPrice1;
        System.out.println(maruthiPrice);
        return maruthiPrice;
    }
}
