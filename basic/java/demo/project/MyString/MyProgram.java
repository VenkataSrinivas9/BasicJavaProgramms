/*****************************************************************************/
/* SCI */
/* All Rights Reserved. Copyright (C) 2008, Hitachi, Ltd. */
/* Licensed Material of Hitachi, Ltd. */
/* Reproduction, use, modification or disclosure otherwise than */
/* permitted in the License Agreement is strictly prohibited. */
/*****************************************************************************/

package basic.java.demo.project.MyString;

import java.awt.Font;
import java.io.IOException;

/**
 * 
 */
public class MyProgram {

    /**
     * @param args
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static void main(String[] args) throws IOException,
            InstantiationException, IllegalAccessException,
            ClassNotFoundException {

//        MyString str1 = "Hi! This is my own string class";
        
        String str = "This is a new extension for string class.";
        System.out.println("Main String:       "+str);

        MyString mys = new MyString();
        str = mys.addString(str, "extension", "method");
        System.out.println("Add String after:  "+ str);

        str = mys.addString(str, 14, "method");
        System.out.println("Add String at:     "+str);

        str = mys.removeString(str, 24);
        System.out.println("Remove String at:  "+str);

        str = mys.removeString(str, "method");
        System.out.println("Remove String:     "+str);

        str = mys.replaceString(str, "extension", "method");
        System.out.println("Replace String:    "+str);

        str = mys.replaceString(str, 14, "extension");
        System.out.println("Replace String at: "+str);

    }

}