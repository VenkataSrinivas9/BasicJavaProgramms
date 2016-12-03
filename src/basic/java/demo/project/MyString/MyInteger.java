package basic.java.demo.project.MyString;

/**
 * 
 */
public class MyInteger {
    public static void main(String[] args) {

//        int x = Integer.parseInt("0"+1);
        int x = 123456;
        int y = intergerLength(x);
        boolean z = intergerContains(x, 3);
        System.out.println(y);
        System.out.println(z);

    }

    private static boolean intergerContains(int x, int i) {
        String str = Integer.toString(x);
        if (str.contains(Integer.toString(i))) {
            return true;
        }
        return false;
    }

    private static int intergerLength(int x) {
        String str = Integer.toString(x);
        return str.length();
    }
}
