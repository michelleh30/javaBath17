package review4;

public class E3NestedLoop {
    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {//this print out one at a time

            for (int j = i; j <= 3; j++) {//we dont see 3 because 3is not less then 3, it repeat until it become false
                System.out.println(i+" "+j);
            }
        }
    }
}
