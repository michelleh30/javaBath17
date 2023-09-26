package projectCodes2;
/*
Q10
We have to calculate the average of marks obtained in three subjects
by student A and by student B. Create class 'Marks' with an abstract
method 'getPercentage' that will be returning the average percentage
of marks. Provide implementation of abstract method in classes 'A'
and 'B'. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its
parameters for student B. Test your code
 */
abstract class Marks {
    abstract double getPercentage();

}
class StudentA extends Marks{
   private double Sub1;
   private double Sub2;
   private double Sub3;

   public StudentA(double Sub1, double Sub2, double Sub3){
       this.Sub1=Sub1;
       this.Sub2=Sub2;
       this.Sub3=Sub3;

   }

    @Override
    double getPercentage() {
       return (Sub1 + Sub2 + Sub3) /3;

    }
}
class  StudentB extends Marks{
    private double Sub1;
    private double Sub2;
    private double Sub3;
    private double Sub4;

    public StudentB(double Sub1, double Sub2, double Sub3, double Sub4){
        this.Sub1=Sub1;
        this.Sub2=Sub2;
        this.Sub3=Sub3;
        this.Sub4=Sub4;

    }

    @Override
    double getPercentage() {
        return (Sub1+Sub2+Sub3+Sub4)/4;

    }

    public static void main(String[] args) {
        StudentA studentA=new StudentA(79.5,88.0,93.0);
        System.out.println("Student A's average percentage:"+ studentA.getPercentage()+"%");

        StudentB studentB=new StudentB(80.0,93.5,75.5,99.0);
        System.out.println("Student B's average percentage:"+ studentB.getPercentage()+"%");
    }
}

