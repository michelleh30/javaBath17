package review8;
//Theres limitation on local var
public class E1LocalVar {
    public static void main(String[] args) {
        //System.out.println(county);//it will not work b/c we can not access it

        String county="USA";//can not access it on line num 10, it starts at line num 4
        //and ends line 17. It can be access in the whole code line 12 and line 16

        {//code starts at line 7 and ends 10
            int age=10;
            System.out.println(county);
        }
        if(10>5){//code starts at line 11 and ends 13 but we cant access name line 14
            String name="Wanda";
            System.out.println(county);
        }
        //System.out.println(name);
        //System.out.println(age);
    }
}
