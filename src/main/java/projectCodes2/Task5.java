package projectCodes2;

import java.util.Arrays;

/*
Check if Two Strings are Anagrams: Given two strings, determine if
they are anagrams, meaning they contain the same characters in a
different order. For example, "listen" and "silent" are anagrams.
 */
public class Task5 {
    public static void main(String[] args) {
        /*
        String str1 = "listen";
        String str2 = "silent";

        char [] arr1 =str1.toCharArray();
        char [] arr2 =str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String sortedstr1 = new String(arr1);
        String sortedstr2 = new String(arr2);

        if(sortedstr1.equals(sortedstr2)){
            System.out.println("It is Anagram");
        }else{
            System.out.println("Not an Anagram");
        }

         */
        String str1 = "listen";
        String str2 = "silent";

        char [] arr1 =str1.toCharArray();
        char [] arr2 =str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isAnaGram = Arrays.equals(arr1,arr2);
        System.out.println(isAnaGram);





    }

}
