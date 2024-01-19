package review13;
//so does this printStackTrace print the entire error code that is in red as actual output?
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E4ExcelFiles {
    public static void main(String[] args) {

        String path="C:\\Users\\mdh26\\IdeaProjects\\javaBath17\\Files\\Employees.xlsx";
        try(FileInputStream fileInputStream= new FileInputStream(path);

            XSSFWorkbook xssfWorkbook=new XSSFWorkbook(path);){
            Sheet sheet= xssfWorkbook.getSheet("EmpData");
            //we want bobs age
            //Row row= sheet.getRow(4);//this well get us the complet row of bob
            //get the cell
            //System.out.println(row.getCell(2));
            int numOfRows=sheet.getPhysicalNumberOfRows();//data of all the number sod rows
            List<Map<String,String>> excelDta=new ArrayList<>();
            for(int i=0; i<numOfRows;i++){
                Map<String,String> rowData=new LinkedHashMap<>();

                Row row= sheet.getRow(i);
                //how many cell in a specific row
                int noOfCells=row.getPhysicalNumberOfCells();
                for (int j = 0; j <noOfCells ; j++) {

                    System.out.print(row.getCell(j)+" ");//this will print all the data

                }
                System.out.println();
            }


        }catch (IOException io){
            io.printStackTrace();//
        }
    }
}
