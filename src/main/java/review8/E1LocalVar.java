package review8;

public class E1LocalVar {
    public static void main(String[] args) {
        //System.out.println(county);//it will not work b/c we can not access it

        String county="USA";
        {
            int age=10;
        }
        if(10>5){
            String name="Wanda";
        }
        //System.out.println(name);
        //System.out.println(age);
    }
}
