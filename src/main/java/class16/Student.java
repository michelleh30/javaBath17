package class16;
//write a Student cl;ass that have instance variables name and address.
// Create a constructor that will initialize those
//variable. Print name & address of given student.
public class Student {
        private String name;
        private String address;

        public Student(String name, String address){
                this.name=name;
                this.address=address;

        }
        public void printInfo(){
                System.out.println(name+" "+address);
        }

        public static void main(String[] args) {
                Student s1=new Student("Michelle","6123 Vista Dr Virginia");
                s1.printInfo();

        }

}
