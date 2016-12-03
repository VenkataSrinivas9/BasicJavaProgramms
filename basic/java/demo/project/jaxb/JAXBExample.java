package basic.java.demo.project.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class JAXBExample {
    private static final String FILE_NAME1 = "D:\\VenkataMedapati\\BasicJava_Demos\\src\\basic\\java\\demo\\project\\jaxb\\jaxb-emp1.xml";
    private static final String FILE_NAME2 = "D:\\VenkataMedapati\\BasicJava_Demos\\src\\basic\\java\\demo\\project\\jaxb\\jaxb-emp2.xml";

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setId(11);
        emp.setAge(25);
        emp.setName("VENKATA MEDAPATI");
        emp.setGender("Male");
        emp.setRole("Developer");
        emp.setPassword("sensitive");
        jaxbObjectToXML(emp);
//        Employee empFromFile = jaxbXMLToObject();
        System.out.println(emp.toString());
        System.out.println();
        System.out.println("=========================================");
        System.out.println();
        Employee empFromXML = jaxbXMLToObject();
        System.out.println(empFromXML.toString());
    }

    private static Employee jaxbXMLToObject() {
        try {
            JAXBContext context = JAXBContext.newInstance(Employee.class);
            Unmarshaller un = context.createUnmarshaller();
            Employee emp = (Employee) un.unmarshal(new File(FILE_NAME2));
            return emp;
        }
        catch (JAXBException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void jaxbObjectToXML(Employee emp) {
        try {
            JAXBContext context = JAXBContext.newInstance(Employee.class);
            Marshaller m = context.createMarshaller();
            // for pretty-print XML in JAXB
            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            // Write to System.out for debugging

            m.marshal(emp, System.out);
            // Write to File
            m.marshal(emp, new File(FILE_NAME1));
        }
        catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
