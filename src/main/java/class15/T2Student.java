package class15;
//    Write a java class students that have a constructor which takes students name and
//3 subject grades. inside you class have method to calculate Average grade. Test
//students class for 2 different students with  different marks. your program should
//print an average mark of each student's name.
public class T2Student {
    private String name;
    private int grade1;
    private int grade2;
    private int grade3;

    public T2Student(String aName,int aGrade, int bGrade,int cGrade){
        name=aName;
        grade1=aGrade;
        grade2=bGrade;
        grade3=cGrade;
    }
    public void printAvg(){
        int avg=0;
        avg=(grade1+grade2+grade3)/3;
        System.out.println(name+" got "+avg);
    }
    public void printName(){
        System.out.println(name);
    }

    public static void main(String[] args) {
      T2Student s1= new T2Student("Michelle",90,80,80);
      s1.printAvg();
      s1.printName();
        new T2Student("nelson",89,67,70).printAvg();

    }
}
