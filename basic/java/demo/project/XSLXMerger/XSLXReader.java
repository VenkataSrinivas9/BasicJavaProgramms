package basic.java.demo.project.XSLXMerger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

/**
 * 
 */
public class XSLXReader {
    /**
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            FileInputStream file = new FileInputStream(new File("D:\\VenkataMedapati\\BasicJava_Demos\\src\\basic\\java\\demo\\project\\XSLXMerger\\ABC.xls"));
            HSSFWorkbook xlsWorkbook = new HSSFWorkbook(file);
            HSSFSheet sheet = xlsWorkbook.getSheetAt(0);

            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();

                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()) {
                        case Cell.CELL_TYPE_NUMERIC:
                            System.out.print(cell.getNumericCellValue() + "\t");
                            break;
                        case Cell.CELL_TYPE_STRING:
                            System.out.print(cell.getStringCellValue()+ "\t");
                            break;
                    }

                }
                System.out.println(" ");
            }
            file.close();
        }
        catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }

    }

}
