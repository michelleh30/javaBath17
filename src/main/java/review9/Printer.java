package review9;

public class Printer {

    void print() {
        System.out.println("Hello");
    }

    void print(String word) {
        System.out.println(word);
    }

    void print(int age) {
        System.out.println(age);
    }

    void print(double weight) {
        System.out.println(weight);
    }

    void print(String word, int num) {
        System.out.println(word + " " + num);
    }

    void print(int num, String word) {
        System.out.println(num + " " + word);
    }
    // variables args, when you are not sure how many use this

    void print(String...a){//can pass a lot of numbers

        System.out.println("pass as many");

    }
    void print(int ... arr){
        for(int num:arr){
            System.out.println(num);
        }
    }
}
