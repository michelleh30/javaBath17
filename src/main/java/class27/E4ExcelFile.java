package class27;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E4ExcelFile {
    public static void main(String[] args) throws IOException {
        //location of the file
        String path="C:\\Users\\mdh26\\IdeaProjects\\javaBath17\\Files\\Employees.xlsx";
        //load it from the perment storage into the RAM, Class that brings the data in the form of bytes into memory
        FileInputStream fis=new FileInputStream(path);
        //the special Class which knows how to handle Excel file, make a class to handle the file
        XSSFWorkbook workbook=new XSSFWorkbook(fis);//for excel file

        //most of the path is done now need to make some methods
        Sheet sheet1=  workbook.getSheet("Sheet1");//name of the excel file

        //gives us the row at index 1
        Row row= sheet1.getRow(1);
        //gives us the colum/cell at index number 2
        Cell cell =row.getCell(2);
        System.out.println(cell);




    }
}
