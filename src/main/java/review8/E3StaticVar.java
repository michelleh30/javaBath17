package review8;
// you can access static in a diiferent package, use static when you want to share code
public class E3StaticVar {
   public static final String country="USA";//static and final so that no one cna change it

   void printName(){//instance method
       System.out.println(country);//instance are able to access the static method
       // into the instance method
   }
   static void printCountry(){//static, can
       System.out.println(country);

   }

    public static void main(String[] args) {
        System.out.println(country);
    }

}
class StaticTester{
    public static void main(String[] args) {
        System.out.println(E3StaticVar.country);

    }
}
