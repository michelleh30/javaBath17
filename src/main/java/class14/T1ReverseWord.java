package class14;
//how would you reverse a String word by word?
//input=> This is sentence I want to reverse
//output=>
public class T1ReverseWord {
    public static void main(String[] args) {
        //StringBuilder sb=new StringBuilder("This is sentence I want to reverse");
        //sb.reverse();
        //System.out.println(sb);//not correct because they change the words around

        String str="This is sentence I want to reverse";
         String [] arr=str.split(" ");

        for (int i = 0; i <arr.length ; i++) {//()paratacess<--that means a methods, trying to cause the methods

            String word = arr[i];
            String reversed = reverseStr(word);
            System.out.println(reversed + " ");


            //System.out.println(arr[i]);

            //System.out.println(reverseStr("This"));
        }

    }
    //method
    static String reverseStr(String inputStr){
        String reversed="";
        for (int i = inputStr.length()-1; i >=0 ; i--) {
            reversed=reversed+inputStr.charAt(i);

        }
        return reversed;

    }
}
