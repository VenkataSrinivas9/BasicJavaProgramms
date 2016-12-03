package practice.demo;

public class JavaMemoryPuzzlePolite {

    private final int dataSize = (int) (Runtime.getRuntime().maxMemory() * 0.46);

    public void f() {
        
            System.out.println(dataSize);
            byte[] data = new byte[dataSize];
        
            
//        int i = 0;
         /*for (int i = 0; i < 1; i++) {
         System.out.println("Please be so kind and release memory");
         }*/
        // execute before&after commenting For loop
        System.out.println(dataSize);
        byte[] data2 = new byte[dataSize];
    }

    public static void main(String[] args) {
        JavaMemoryPuzzlePolite jmp = new JavaMemoryPuzzlePolite();
        JavaMemoryPuzzlePolite jmp1 = new JavaMemoryPuzzlePolite();
        jmp.f();
        jmp1.f();
    }

}