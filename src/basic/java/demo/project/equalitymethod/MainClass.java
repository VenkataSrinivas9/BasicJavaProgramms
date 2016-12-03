package basic.java.demo.project.equalitymethod;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 */
public class MainClass {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        EmployeeDetails p1 = new EmployeeDetails(75294, "srinivas");
        EmployeeDetails p2 = new EmployeeDetails(75295, "venkata");
        EmployeeDetails p3 = new EmployeeDetails(75294, "srinivas");
        HashSet<EmployeeDetails> coll = new HashSet<EmployeeDetails>();
        coll.add(p1);
        coll.add(p2);
        coll.add(p3);
//         System.out.println(coll.equals(p3));
        System.out.println(coll.contains(p2));
//         System.out.println(p1.equals(p3));
//         System.out.println(p2.equals(p3));
        for (Iterator iterator = coll.iterator(); iterator.hasNext();) {
            EmployeeDetails employeeDetails = (EmployeeDetails) iterator.next();
            System.out.println(employeeDetails.getEmpID() + " " + employeeDetails.getEmpName());
//            System.out.println(employeeDetails);
        }
        
    }

}

