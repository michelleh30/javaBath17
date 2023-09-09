package class19;
//use static void method
//Create 1 class with a static method that has 3 overloaded forms.
// Then call each overloaded method with specific arguments and observe result.
//dont need a obj,
public class Task2 {

    public static void print(){
        System.out.println("michelle like nelson");


    }public static void print(String word) {
        System.out.println("valentina like nelson" +word);
    }

    public static void main(String[] args){
        Task2.print();
        Task2.print("good");//"word"
        //String.this are method that dont need instand feild
    }

}
