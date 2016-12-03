/*****************************************************************************/
/* SCI */
/* All Rights Reserved. Copyright (C) 2008, Hitachi, Ltd. */
/* Licensed Material of Hitachi, Ltd. */
/* Reproduction, use, modification or disclosure otherwise than */
/* permitted in the License Agreement is strictly prohibited. */
/*****************************************************************************/

package basic.java.methodoverload;

import basic.java.methodoverload.Automobiles;
import basic.java.methodoverload.AutomobilesSubclass;

/**
 * 
 */
public class OverloadMainTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Automobiles autObj = new Automobiles();
//         Automobiles autSubObj = new AutomobilesSubclass();
//         AutomobilesSubclass autSubObj = (AutomobilesSubclass) new Automobiles();
        AutomobilesSubclass ascObj = new AutomobilesSubclass();

        autObj.suzuki();
        System.out.println();
        // autSubObj.suzuki("10laks");
        // autSubObj.suzuki("10laks","Green");
        // autSubObj.suzuki("10laks","Red","A4");
        // autSubObj.suzuki();
        // ascObj.suzuki("5laks");
        // ascObj.suzuki("6laks", "Black");
        // ascObj.suzuki("7laks", "White", "A3");
        System.out.println();
        ascObj.suzuki("10laks");
        ascObj.suzuki("12laks", "Green");
        ascObj.suzuki("14laks", "Red", "A4");
    }

}
