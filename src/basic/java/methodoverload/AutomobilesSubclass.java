/*****************************************************************************/
/* SCI */
/* All Rights Reserved. Copyright (C) 2008, Hitachi, Ltd. */
/* Licensed Material of Hitachi, Ltd. */
/* Reproduction, use, modification or disclosure otherwise than */
/* permitted in the License Agreement is strictly prohibited. */
/*****************************************************************************/

package basic.java.methodoverload;

/**
 * 
 */
public class AutomobilesSubclass
        extends Automobiles {

    private String suzukiPrice;

    private String suzukiColor;

    private String suzukiModelNo;

    public void suzuki(String suzukiPrice1) {
        suzukiPrice = suzukiPrice1;
        System.out.println(suzukiPrice);

    }

    public void suzuki(String suzukiPrice1, String suzukiColor1) {
        suzukiPrice = suzukiPrice1;
        suzukiColor = suzukiColor1;
        System.out.print(suzukiPrice + ", ");
        System.out.println(suzukiColor);

    }

    public void suzuki(String suzukiPrice1, String suzukiColor1, String suzukiModelNo1) {
        suzukiPrice = suzukiPrice1;
        suzukiColor = suzukiColor1;
        suzukiModelNo = suzukiModelNo1;
        System.out.print(suzukiPrice + ", ");
        System.out.print(suzukiColor + ", ");
        System.out.println(suzukiModelNo);
    }

}
