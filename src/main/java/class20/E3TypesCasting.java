package class20;

public class E3TypesCasting {
    public static void main(String[] args) {
        Student s1=new Student("Michelle","A123");//()calling the con
        //new created an obj
        //Student("Michelle","A123");//()calling the con of the class
        //=assign
        //s1 variable it contains obj of the student class
        //si=Student

        Student s2=new Student("Vale","1234");

        Student[] arr= {new Student("Michelle","A123"),new Student("Vale","1234")};//creating an array of student

        //arr[1].printInfo();

        for (int i = 0; i < arr.length; i++) {
            Student s=arr[i];//storing arr in s in object of student class
            s.printInfo();//s changing everytime thats why it prints 2 diff things

        }
        int num=(int)12.5;//explicit
        System.out.println(num);
        double age=10;//implicit, widing

        Animal a= new Dog();//implicit, widening,auto
        //Dog d=new Animal();//MOVING BIG DATA TYPE TO SMALL, look at linw 29
        Dog d=(Dog)new Animal();




    }
}
