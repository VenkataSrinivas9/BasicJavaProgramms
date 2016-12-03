/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.java.game.tictactoe;

/**
 *
 * @author Student
 */
public class bordmaker extends tikitata {
    public void dispbrd() {
        // System.out.println(" | | ");

        System.out.println(s[0][0] + " | " + s[0][1] + " | " + s[0][2]);
        System.out.println("-----------");
        System.out.println(s[1][0] + " | " + s[1][1] + " | " + s[1][2]);
        System.out.println("-----------");
        System.out.println(s[2][0] + " | " + s[2][1] + " | " + s[2][2]);
        // System.out.println(" | | ");
    }

}
