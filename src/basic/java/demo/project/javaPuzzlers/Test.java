package basic.java.demo.project.javaPuzzlers;

import java.util.Calendar;

public class Test {

    public static void main(String[] args) {

        // The addition performed by the program is a mixed-type computation:
        // The left operand is of type long , and the right operand is of type int . To
        // perform the com- putation, Java promotes the int value to a long with a widening
        // primitive conver- sion [JLS 5.1.2] and adds the two long values. Because int is a
        // signed integral type, the conversion performs sign extension: It promotes the
        // negative int value to a numerically equal long value.
        //
        // The right operand of the addition, 0xcafebabe , is promoted to the
        // long value 0xffffffffcafebabeL . This value is then added to the left operand,
        // which is 0x100000000L . When viewed as an int , the high-order 32 bits of the
        // sign- extended right operand are -1 , and the high-order 32 bits of the
        // left operand are 1 . Add these two values together and you get 0 , which explains the
        // absence of the leading 1 digit in the program’s output. Here is how the addition
        // looks when done in longhand. (The digits at the top of the addition are carries.)
        // 1111111
        // 0xffffffffcafebabeL
        // + 0x0000000100000000L
        // 0x00000000cafebabeL
        //
        // 0xcafebabeL and 0xcafebabe - see the difference 
        // To avoid this sort of difficulty, it is generally best to avoid
        // mixed-type computations.
//        System.out.println(Long.toHexString(0x100000000L));
//        System.out.println(Long.toHexString(0xcafebabeL));
//        System.out.println(Long.toHexString(0x100000000L + 0xcafebabeL));


        // Mixed-type comparisons - if (b == (byte)0x90)
//        System.out.println(0x90);
//        for (byte b = Byte.MIN_VALUE; b < Byte.MAX_VALUE; b++) {
//            if (b == 0x90) System.out.print("Joy!");
//        }
        
        // The System.exit method halts the execution of
        // the current thread and all others dead in their tracks.
//        try {
//            System.out.println("Hello world");
//            System.exit(0);
//        }
//        finally {
//            System.out.println("Goodbye world");
//        }
    }

}