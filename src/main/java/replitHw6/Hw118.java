package replitHw6;
/*
Write a method header on line two with the following specs:
Returns:a String
Name:spaceOut
Parameters:a String

Then complete the method by programming the following behavior
Insert spaces after every character in the String s, then return the new string.
See below examples (note the space at the end as well).
Examples:

spaceOut("hello") ==> "h e l l o "
 */
public class Hw118 {
    public static void main(String[] args) {
        String spaceOut="hello";
        char []arr=spaceOut.toCharArray();

        for(char c:arr){
            System.out.print(c+" ");
        }
    }
}
