package review9;

public class PrinterTester {
    public static void main(String[] args) {

        Printer p=new Printer();
        //p.print();//"hello" because of the parameters
        //p.print("java");//one parameter that is (String word)
        //p.print(20);//int age
        //p.print(20,"java");//java does sequence match int num,String word)
        p.print(20);
        p.print(10,32,45,78,45,89);
        p.print(34,6,7,98,0,6);
        System.out.println();


        System.out.println(Math.abs(15));//removes the sign and just gives the value-15
        //Scanner scanner=new Scanner(System.in);
        //scanner.nextByte();
        String str= String.valueOf(100);// convert any int to a String
        System.out.println(str);


    }
}
