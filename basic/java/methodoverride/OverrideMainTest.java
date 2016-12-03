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
public class OverrideMainTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Automobiles autObj = new Automobiles();
        Automobiles autSubObj = new AutomobilesSubclass();
        // AutomobilesSubclass asObj = (AutomobilesSubclass) new Automobiles();
        AutomobilesSubclass ascObj = new AutomobilesSubclass();

        Automobiles.audi();
        autObj.BMW();
        autObj.suzuki();
        autObj.maruthi("12lakhs");

        System.out.println();
        Automobiles.audi();
        autSubObj.BMW();
        
        autSubObj.suzuki();
        autSubObj.maruthi("15lakhs");

        // System.out.println();
        // asObj.audi();
        // asObj.suzuki();
        // asObj.maruthi("16lakhs");

        System.out.println();
        AutomobilesSubclass.audi();
        ascObj.suzuki();
        ascObj.maruthi("16lakhs");

    }

}
