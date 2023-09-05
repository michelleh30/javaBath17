package class12;
//Write a method to return whether given number is prime or not?
//Create  class Student that will have a method getGrade.
// Your method should accept the score of a student and return a grade:
//score > 90 - A
//score >80 - B
//score >70 - C
//score > 50 - D
//anything else - F
public class Hw1 {


    void gradePrimeEven(int num){
        if (num>90){
            System.out.println('A');
        }else if (num>80){
            System.out.println('B');
        }else if(num>70){
            System.out.println('C');

        }else if(num>50){
            System.out.println('D');
        }else {
            System.out.println('F');
        }
    }
}
