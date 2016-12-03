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
public class AutomobilesSubclass extends Automobiles {

    protected static void audi() {
        String audiPrice = "40lakhs";
        System.out.println(audiPrice);
    }
    
    protected String benz() {
        String benzPrice = "50lakhs";
        System.out.println(benzPrice);
        return benzPrice;
    }

    protected String suzuki() {
        String suzukiPrice = "20lakhs";
        System.out.println(suzukiPrice);
        return suzukiPrice;
    }

    protected String maruthi(String maruthiPrice1) {
        String maruthiPrice = maruthiPrice1;
        System.out.println(maruthiPrice);
        return maruthiPrice;
    }
}
