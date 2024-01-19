package class28;
/*
create an excel file store some data inside it and read that data
using the methods that we have just created
 */
import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) throws IOException {
        List<Map<String,String>> data= ExcelReader.readExcelData("C:\\Users\\mdh26\\IdeaProjects\\javaBath17\\Files\\Sales.xlsx");
        System.out.println(data);
    }

}
