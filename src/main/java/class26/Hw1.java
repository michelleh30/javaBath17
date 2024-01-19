package class26;

import java.util.Collections;
import java.util.Objects;
import java.util.TreeMap;

/*
Create a Map that will store Employee name and salary.
Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format
John Smith=$100000
 */
public class Hw1 {
    public static void main(String[] args) {
        TreeMap<String, Integer> employee = new TreeMap<>();
        employee.put("Michelle Lopez", 88000);
        employee.put("Nelson Santos", 76000);
        employee.put("Valentina Gracia", 98000);
        employee.put("John Smith", 100000);
        System.out.println(employee);

        Integer highSalary = (Collections.max(employee.values()));
        var money = employee.entrySet();
        for (var m : money) {
            if (m.getValue() == highSalary) {
                System.out.println(m.getKey() + " $" + m.getValue());
            }
        }


    }
}
