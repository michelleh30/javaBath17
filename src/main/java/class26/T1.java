package class26;
/*
Create a map of a building. Store floor number and its associated company name.
Example: 1= Google, 2=Syntax etc..).
Insert 7 entries with duplicate keys and values.
Check how many entries you have?
Update company on a 4th floor
Remove company on the 7th floor
Print your map
 */
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class T1 {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> building=new LinkedHashMap<>();
        building.put(1,"Google");
        building.put(2,"Syntax");
        building.put(3,"Yahoo");
        building.put(1,"Chipotle");
        building.put(4,"Samsung");
        building.put(5,"Apple");
        building.put(7,"Amazon");


        System.out.println(building);
        System.out.println("Company Size: "+building.size());//size
        System.out.println("Company replaced: "+building.replace(4,"BestBuy"));//replace
        System.out.println("Company removed: "+building.remove(7));//remove

        System.out.println("Updated Building "+building);
    }
}
