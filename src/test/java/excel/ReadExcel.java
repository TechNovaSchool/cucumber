package excel;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {
    public static void main(String[] args) throws IOException {
        File file = new File("src/Test123.xlsx");
//       System.out.println(file.exists());
        //load file into java code
        FileInputStream fileInputStream = new FileInputStream(file);

        //load the excel workbook into java class
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

        XSSFSheet sheet = workbook.getSheet("ExcelRead");
        System.out.println(sheet.getRow(1).getCell(2));

        //
        int usedRows = sheet.getPhysicalNumberOfRows();
        System.out.println(usedRows);

        //create a logic to print key metrics name

        for (int row = 0; row < usedRows; row++) {
            if (sheet.getRow(row).getCell(0).toString().equals("Key metrics")) {
                System.out.println("info exist in that table");
            }
        }

        //TODO:Print key metrics of Scrum and Kanban
        for (int row = 0; row < usedRows; row++) {
            if (sheet.getRow(row).getCell(2).toString().equals("Lead time, cycle time, WIP")) {
                System.out.println("Lead time, cycle time, WIP");
            }
        }

        for (int row = 0; row < usedRows; row++) {
            if (sheet.getRow(row).getCell(1).toString().equals("Velocity")) {
                System.out.println("Velocity");
            }
        }

    }
}
