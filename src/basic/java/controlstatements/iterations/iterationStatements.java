/*****************************************************************************/
/* SCI */
/* All Rights Reserved. Copyright (C) 2008, Hitachi, Ltd. */
/* Licensed Material of Hitachi, Ltd. */
/* Reproduction, use, modification or disclosure otherwise than */
/* permitted in the License Agreement is strictly prohibited. */
/*****************************************************************************/

package basic.java.controlstatements.iterations;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 */
public class iterationStatements {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        // while
        // do while
        // for
        // foreach
        // iterator

        // while loop statements

        int intValue1 = 5;
        int i = 0;
        System.out.println("While loop: ");
        while (i <= intValue1) {
            System.out.println(i);
            i++;
        }

        // do while loop statements

        int intValue2 = 0;
        int j = 6;
        System.out.println("Do...While loop: ");
        do {
            System.out.println(j);
            j--;
        } while (j >= intValue2);

        // for loop statements

        String[] arValues1 = { "Venkata", "Srinivas", "M V " };
        System.out.println("For loop: ");
        for (int a = 0; a < arValues1.length; a++) {
            System.out.println(arValues1[a]);
        }

        // foreach loop statements
        System.out.println("For-each loop: ");
        for (String s : arValues1) {
            System.out.print(s + " ");
        }
        System.out.println();

        // iterator loop statements

        ArrayList<String> arValues2 = new ArrayList<String>();
        arValues2.add("Hi! ");
        arValues2.add("This is a ");
        arValues2.add("iterator for arraylist.");
        System.out.println("Iterator loop: ");

        Iterator<String> itr = arValues2.iterator();
        while (itr.hasNext()) {
            Object element = itr.next();
            System.out.print(element);

        }

    }

}
