package excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WriteExcel {
    public static void main(String[] args) throws Exception{
        XSSFWorkbook workbook;
        XSSFSheet sheet;

        String path = "src/Test123.xlsx";

        //workbook>sheet>row>cell
        //loading excel workbook into class
        FileInputStream fileInputStream = new FileInputStream(path);

        workbook = new XSSFWorkbook(fileInputStream);

        //get the sheet
        sheet = workbook.getSheet("ExcelRead");

        //length sprint cell

        XSSFCell sprintCell = sheet.getRow(1).getCell(1);
        sprintCell.setCellValue("fix length sprint usually 2-3 weeks");
        System.out.println(sprintCell);

        //need to set file output stream to which file we are writing


        //TODO: Change "continues flow" to  "flow continues" in dynamic way

        for (int row = 0; row < sheet.getPhysicalNumberOfRows(); row++) {
            if (sheet.getRow(row).getCell(2).toString().equals("Continuous flow")) {
                sheet.getRow(row).getCell(2).setCellValue("Flow Continues");
            }
        }

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        fileInputStream.close();
        fileOutputStream.close();
        workbook.close();


    }
}
