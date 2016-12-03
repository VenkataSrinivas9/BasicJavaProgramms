/*****************************************************************************/
/* SCI */
/* All Rights Reserved. Copyright (C) 2008, Hitachi, Ltd. */
/* Licensed Material of Hitachi, Ltd. */
/* Reproduction, use, modification or disclosure otherwise than */
/* permitted in the License Agreement is strictly prohibited. */
/*****************************************************************************/

package basic.java.controlstatements.selections;

import java.util.Scanner;

/**
 * 
 */

public class selectionStatements {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // TODO Auto-generated method stub
        // if
        // if-else
        // else-if
        // nested if
        // switch case

        // if selection statements

        Scanner sc1 = new Scanner(System.in);
        String sValue1 = sc1.next();
        if (sValue1.equals("venkat")) {
            System.out
                    .println("U have entered if statement of if selection statements.");
        }

        // if statements are used for true conditions only
        // for false conditions?
        // if else selectionn statements!

        Scanner sc2 = new Scanner(System.in);
        String sValue2 = sc2.next();
        if (sValue2.equals("Hi")) {
            System.out
                    .println("U entered if statement of if-else selection statements.");
        }
        else {
            System.out
                    .println("U entered else statement of if-else selection statements");
        }

        // if-else statements are used only in case of single true/false
        // condition
        // For more than one true/false conditions
        // else if selection statements!

        Scanner sc3 = new Scanner(System.in);
        String sValue3 = sc3.next();
        if (sValue3.equals("if")) {
            System.out
                    .println("U entered if statement of else-if selection statements.");
        }
        else if (sValue3.equals("elseif1")) {
            System.out
                    .println("U entered elseif1 statement of else-if selection statements.");
        }
        else if (sValue3.equals("elseif2")) {
            System.out
                    .println("U entered elseif2 statement of else-if selection statements.");
        }
        else {
            System.out
                    .println("U entered else statement of else-if selection statements");
        }

        // Nested if

        boolean bValue1 = true;
        boolean bValue2 = false;
        if (bValue1) {
            System.out.println("Outter if of if-else statement");

            if (bValue2) {
                System.out.println("Inner if of if-else statement");
            }
            else {
                System.out.println("Inner else of if-else statement");
            }

        }
        else {
            System.out.println("Outter else of if-else statement");
        }

        // Switch Case

        System.out.println("Enter any number from 1 to 5: ");
        Scanner sc4 = new Scanner(System.in);
        String sValue = sc4.next();
        int intValue = Integer.parseInt(sValue);
        switch (intValue) {
            case 1:
                System.out.println("U pressed one.");
                break;
            case 2:
                System.out.println("U pressed two.");
                break;
            case 3:
                System.out.println("U pressed three.");
                break;
            case 4:
                System.out.println("U pressed four.");
                break;
            case 5:
                System.out.println("U pressed five.");
                break;
            default:
                System.out.println("U pressed out of range.");
                break;
        }

    }
}
