package review9;

//giving more opion overloaded
public class Calculator {
    void add(int a, int b) {
        System.out.println(a + b);
    }

    int add(int a, int b, int c) {//method that return something
        return a + b + c;//when we want use that result somewhere
        // in class we can used return result
    }



}
