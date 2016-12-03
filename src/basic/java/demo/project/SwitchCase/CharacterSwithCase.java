package basic.java.demo.project.SwitchCase;

public class CharacterSwithCase {

    // Here the Characters in Case statement are converted into its ASCII code
    // case 65: // 'A' ASCII code is 65
    //     System.out.println("Switch Case A");
    //     break;
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char switchkey = 'S';
        switch (switchkey) {
        case 'A':
            System.out.println("Switch Case A");
            break;

        case 'B':
            System.out.println("Switch Case B");
            break;
        case 'C':
            System.out.println("Switch Case C");
            break;
        default:
            System.out.println("Default Case ");
            break;
        }
        Byte byte1 = (byte) 'A';
        int i = 'A';
        System.out.println(i);

    }

}
