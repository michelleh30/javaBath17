package review6;

public class E2StringMethods {
    public static void main(String[] args) {
        String str="This is a java class";
        boolean starts=str.startsWith("T");//this will give an boolean

        System.out.println(starts);
        System.out.println(str.endsWith("class"));
        System.out.println(str.contains("java"));//to see if it has it anywhere
        str.indexOf('a');
        int num='a';
        System.out.println(num);//a=97 java looking at the ascii table

        System.out.println(str.indexOf('a'));//will get 8

       // String.valueOf(12);
       char c= str.charAt(8);
        System.out.println(c);

        char [] arr= str.toCharArray();//convery the string to an array of char
        for(char ch:arr){//enhance loop
            System.out.println(ch);
        }

    }
}
