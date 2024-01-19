package class28;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E3Excel {
    public static void main(String[] args) throws IOException {
        //location of the file
        String path="C:\\Users\\mdh26\\IdeaProjects\\javaBath17\\Files\\Employees.xlsx";
        //load it from the perment storage into the RAM, Class that brings the data in the form of bytes into memory
        FileInputStream fis=new FileInputStream(path);
        //the special Class which knows how to handle Excel file, make a class to handle the file
        XSSFWorkbook workbook=new XSSFWorkbook(fis);//for excel file

        //most of the path is done now need to make some methods
        Sheet sheet1=  workbook.getSheet("EmpData");//name of the excel file

        List<Map<String,String>> empListMap=new ArrayList<>();
        Row headerRow=sheet1.getRow(0);//first name
        for (int i = 1; i <sheet1.getPhysicalNumberOfRows() ; i++) {

            Row row= sheet1.getRow(i);//all the rows one by one
            //create new map every time to store each row
            Map<String,String> rowMap=new LinkedHashMap<>();
            //inner loop to go through all the cells from each row
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                //getting keys from header row
                String keyCell=headerRow.getCell(j).toString();

                String valueCell=row.getCell(j).toString();

                rowMap.put(keyCell,valueCell);
            }

            empListMap.add(rowMap);


        }

        System.out.println(empListMap);
    }
}
