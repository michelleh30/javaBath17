package class20;
/*
Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define 3 common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism

 */
public class Student1 {
    void read() {
        System.out.println("Students can read");
    }

    void study() {
        System.out.println("Students can study");
    }

    void write() {
        System.out.println("Students can write");
    }
}


class SyntaxStudent extends Student1{

    @Override
    void read() {
        System.out.println("Student don't like reading");
    }
}
class CollegeStudent extends Student1{
    @Override
    void study() {
        System.out.println("College student don't like to study");
    }
}
class SchoolStudent extends Student1{
    @Override
    void write() {
        System.out.println("Students have to write a paper");
    }
}


