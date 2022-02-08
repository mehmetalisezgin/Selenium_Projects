package tests.hotel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadEXcel {


    public void readExcel() throws IOException {
        String file = "src/test/java/sampleData.xlsx";
        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);

        // XSSFSheet sheet = workbook.getSheet("Sheet1");
        XSSFSheet sheet = workbook.getSheetAt(0);
        // using for loop

        int rows = sheet.getLastRowNum();
        int cols = sheet.getRow(1).getLastCellNum();
        for (int r = 0; r <= rows; r++) {
            XSSFRow row = sheet.getRow(r);

            for (int c = 0; c < cols; c++) {

                XSSFCell cell = row.getCell(c);
             switch(cell.getCellType()){

                 case STRING:
                     System.out.println(cell.getStringCellValue()); break;
                 case NUMERIC:
                     System.out.println(cell.getNumericCellValue()); break;
                 case BOOLEAN:
                     System.out.println(cell.getBooleanCellValue()); break;
             }


            }
        }


    }

    public static void main(String[] args) throws IOException {
        ReadEXcel readEXcel = new ReadEXcel();
        readEXcel.readExcel();
    }
}
