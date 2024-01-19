package class28;
/*2 loops one for the rows and one for the colum
getPhysicalNumberOfCells(); cell that contains the data
if you dont nested you get only the last row

 */
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E1ExcelFile {
    public static void main(String[] args) throws IOException {

        //location of the file
        String path="C:\\Users\\mdh26\\IdeaProjects\\javaBath17\\Files\\Employees.xlsx";
        //load it from the perment storage into the RAM, Class that brings the data in the form of bytes into memory
        FileInputStream fis=new FileInputStream(path);
        //the special Class which knows how to handle Excel file, make a class to handle the file
        XSSFWorkbook workbook=new XSSFWorkbook(fis);//for excel file

        //most of the path is done now need to make some methods
        Sheet sheet1=  workbook.getSheet("Sheet1");//name of the excel file

        Row row=null;
        for (int i = 0; i <sheet1.getPhysicalNumberOfRows() ; i++) {
             row= sheet1.getRow(i);//all the rows one by one
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                System.out.println(row.getCell(j) + " ");
            }
            System.out.println();

        }

    }
}
