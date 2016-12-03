package basic.java.demo.project.excelasdb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExcelDatabase {

    public static void main(String args[]) throws Exception {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        String myDB = "jdbc:odbc:Driver={Microsoft Excel Driver (*.xls, *.xlsx, *.xlsm, *.xlsb)};" +
                  "DBQ=d:\\VenkataMedapati\\BasicJava_Demos\\src\\basic\\java\\demo\\project\\excelasdb\\exceldatabase.xlsx;" + 
                  "DriverID=22;READONLY=false";
        conn = DriverManager.getConnection(myDB);
        stmt = conn.createStatement();
        String excelQuery = "select * from [Sheet1$]";
        String excelQuery2 = "select * from [Emp$]";
        rs = stmt.executeQuery(excelQuery2);
        System.out.println("EMP ID" + "    " + "EMP NAME");
        System.out.println("----------------------------");
        while (rs.next()) {
            System.out.println(" " + rs.getInt("EMP ID") + "     " + rs.getString(" EMP NAME"));
        }

        // Table Format
        
        rs.close();
        stmt.close();
        conn.close();
    }
}