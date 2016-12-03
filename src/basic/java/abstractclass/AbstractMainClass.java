/*****************************************************************************/
/* SCI */
/* All Rights Reserved. Copyright (C) 2008, Hitachi, Ltd. */
/* Licensed Material of Hitachi, Ltd. */
/* Reproduction, use, modification or disclosure otherwise than */
/* permitted in the License Agreement is strictly prohibited. */
/*****************************************************************************/

package basic.java.abstractclass;

/**
 * 
 */
public class AbstractMainClass {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        AbstractClass acObj = new AbstractSubClass();
        System.out.println(acObj.nameVariable);
        System.out.println(acObj.age());
        System.out.println(acObj.name());
        System.out.println();

        AbstractSubClass ascObj = new AbstractSubClass();
        System.out.println(ascObj.name());
        System.out.println(ascObj.age());
        
        AbstractSubSubClass asscObj = new AbstractSubSubClass();

    }

}
