package class17;
//Write a java program called Teacher. Identify features and 4 behavior of that Class. Create 3 subclasses
//MathTeacher,Chemistry Teacher, and PianoTeacher. Test all 4 classes.
public class Teacher {
    String name;
    String grade;

    void teach(){
        System.out.println("today I will teach java");
    }
    void grade(){
        System.out.println("grading test");
    }
    void talk(){
        System.out.println("Im talking to my students");
    }
    void eating(){
        System.out.println("yum yum");
    }

}
class MathTeacher extends Teacher{
    void math(){
        int sum=2+2;
        System.out.println(sum);
    }

}
class ChemistryTeacher extends Teacher{

}
class PianoTeacher extends Teacher{

}
