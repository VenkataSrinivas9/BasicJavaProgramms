package basic.java.demo.collection;

import java.util.TreeSet;

public class MyTreeSetSecondExample implements Comparable {
    int rollNo;

    String name;

    MyTreeSetSecondExample(String n, int rno) {
        rollNo = rno;
        name = n;
    }

    /** * @param args */
    public static void main(String[] args) {
        TreeSet<MyTreeSetSecondExample> ts = new TreeSet<MyTreeSetSecondExample>();
        ts.add(new MyTreeSetSecondExample("bbb", 2));
        ts.add(new MyTreeSetSecondExample("aaa", 4));
        ts.add(new MyTreeSetSecondExample("bbb", 2));
        ts.add(new MyTreeSetSecondExample("ccc", 3));
        ts.add(new MyTreeSetSecondExample("aaa", 1));
        ts.add(new MyTreeSetSecondExample("zzz", 2));
        ts.add(new MyTreeSetSecondExample("bbb", 5));
        System.out.println(ts);
    }

    public int compareTo(Object obj) {
        MyTreeSetSecondExample s = (MyTreeSetSecondExample) obj;
        
         return this.rollNo - s.rollNo;
        
    }

    public String toString() {
        return name + rollNo;
    }

}
