package class10;

public class Student {
    //Properties/Attributes/idea/plan/design
    String name;
    int age;
    String id;

    ///how student behaves for now void means behavior
    //methods/functions/behaviours
    void study(){//behavior
        System.out.println("Studying 16 hours a day.....");
    }

    public static void main(String[] args) {
        // we are creating actually student by using the Student class/
        // thing that we created in the plan-design
        Student michelleObj=new Student();
        michelleObj.name="michelleObj";
        michelleObj.age=30;
        michelleObj.id="abc123";
        michelleObj.study();
        //once you have the design ready you can make another class/ "student"

        Student nelsonObj =new Student();
        nelsonObj.name="Nelson";
        nelsonObj.age=32;
        nelsonObj.id="abd435";
        nelsonObj.study();//this is the behavior

    }
}
