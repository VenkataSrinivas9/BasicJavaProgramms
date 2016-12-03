package basic.java.demo.project.equalitymethod;

/**
 * 
 */
public class EmployeeDetails {

    private final long empID;

    private String EmpName = "";


    public EmployeeDetails(long empID, String EmpName) {
        this.empID = empID;
        this.EmpName = EmpName;
    }

    /**
     * @return the empID
     */
    public long getEmpID() {
        return empID;
    }

    /**
     * @return the empName
     */
    public String getEmpName() {
        return EmpName;
    }

//    /**
//     * @param empName the empName to set
//     */
//    public void setEmpName(String empName) {
//        EmpName = empName;
//    }

    @Override
    public boolean equals(Object other) {
        // TODO Auto-generated method stub
        boolean result = false;
        if (other instanceof EmployeeDetails) {
            EmployeeDetails that = (EmployeeDetails) other;
            result = (this.getEmpID() == that.getEmpID() && this.EmpName.equals(that.EmpName));
        }
        return result;
    }

//    @Override
//    public int hashCode() {
//        return ((int)getEmpID() + getEmpName().hashCode());
//    }
}
