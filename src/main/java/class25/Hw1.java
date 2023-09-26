package class25;

import java.util.HashSet;

/*
 Create a Set that will hold Objects of Student Type.
 In this set we do not care about the insertion order.
 Each student object should have name and studentID.
 Display name of each student.
 */
public class Hw1 {

    String name;
    int studentId;

    public Hw1(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void printInfo() {
        System.out.println(name + " " + studentId);
    }


    public static void main(String[] args) {
        HashSet<Hw1> student=new HashSet<>();

    }
}