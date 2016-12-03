//package basic.java.demo.project.excelasdb;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//import org.apache.poi.hssf.usermodel.HSSFCell;
//import org.apache.poi.hssf.usermodel.HSSFRow;
//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.openqa.selenium.By;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class PerformDDTest {
//
//    private static HSSFWorkbook xlWBook;
//    private static HSSFSheet xlSheet;
//    private static HSSFRow xlRow;
//    private static HSSFCell xlCell;
//    private static String filePath = "D:/JavaWorkSpace/BasicJava_Demos/src/basic/java/demo/project/excelasdb/";
//    private static String fileName = "exceldatabase.xlsx";
//    private static String url = "http://store.demoqa.com/";
//    private static String result = "Pass";
//
//    public static void main(String[] args) throws InterruptedException {
//
//        try {
//            FileInputStream xlFile = new FileInputStream(filePath + fileName);
//            // Access the required test data sheet
//            xlWBook = new HSSFWorkbook(xlFile);
//            xlSheet = xlWBook.getSheet("Sheet1");
//            xlRow = xlSheet.getRow(1);
//            String username = xlRow.getCell(1).getStringCellValue();
//            String password = xlRow.getCell(2).getStringCellValue();
//            FirefoxDriver driver = new FirefoxDriver();
//            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            driver.manage().window().maximize();
//            driver.get(url);
//            driver.findElement(By.xpath(".//*[@id='account']/a")).click();
//            driver.findElement(By.id("log")).sendKeys(username);
//            driver.findElement(By.id("pwd")).sendKeys(password);
//            driver.findElement(By.id("login")).click();
//            driver.findElement(By.xpath(".//*[@id='account_logout']/a")).click();
//            Thread.sleep(5000);
//            driver.quit();
//            setResultCell();
//            FileOutputStream fout = new FileOutputStream(filePath + fileName);
//            xlWBook.write(fout);
//            fout.flush();
//            fout.close();
//        } catch (IOException e) {
//            // TODO Auto-generated catch block
//            result = "Failed";
//            setResultCell();
//            e.printStackTrace();
//        }
//    }
//
//    private static void setResultCell() {
//        xlCell = xlRow.getCell(3, xlRow.RETURN_BLANK_AS_NULL);
//        if (xlCell == null) {
//            xlCell = xlRow.createCell(3);
//            xlCell.setCellValue(result);
//        } else {
//            xlCell.setCellValue(result);
//        }
//    }
//
//}