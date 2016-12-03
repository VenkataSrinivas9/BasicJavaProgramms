
/*****************************************************************************/
/*      SCI                                                                  */
/*      All Rights Reserved. Copyright (C) 2008, Hitachi, Ltd.               */
/*      Licensed Material of Hitachi, Ltd.                                   */
/*      Reproduction, use, modification or disclosure otherwise than         */
/*      permitted in the License Agreement is strictly prohibited.           */
/*****************************************************************************/ 

package basic.java.designpatterns.creational.builder;

public abstract class ColdDrink implements Item {
    public Packing packing() {
        return new Bottle();
    }
    public abstract float price();
}