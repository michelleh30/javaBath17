package replitHw7;
/*
Returns;an integer
Name:countA
Parameters:a String called s
Purpose:count the number of occurrences of 'a' or 'A' within s
Examples:countA("aaa") ==> 3
countA("aaBBdf8k3AAadnklA") ==> 6
 */
public class Hw133 {
    static int total=0;
    static int countA(String s){
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)=='a' || s.charAt(i)=='A')
             total++;

        }
        return total++;
    }

    public static void main(String[] args){
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }
}
