package basic.java.demo.project.javaPuzzlers;

import java.util.Calendar;

public class Elvis {

    // Final variable before and after Instance
    // private static final int CURRENT_YEAR =Calendar.getInstance().get(Calendar.YEAR);
    // public static final Elvis INSTANCE = new Elvis();

    public static final Elvis INSTANCE = new Elvis();

    private static final int CURRENT_YEAR = Calendar.getInstance().get(
            Calendar.YEAR);

    private final int beltSize;

    private Elvis() {

        beltSize = CURRENT_YEAR - 1930;

    }

    public int beltSize() {

        return beltSize;

    }

    public static void main(String[] args) {

        System.out.println("Elvis wears a size " +

        INSTANCE.beltSize() + " belt.");

    }

}