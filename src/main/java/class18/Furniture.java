package class18;

class GrandPa{
    String color="White";
}
public class Furniture {
    String color="Black";

}
class Chair extends Furniture{
    String color="Brown";

    void printColor(){
        String color="blue";
        //System.out.println(super.color);//black
        System.out.println(color);
        System.out.println(this.color);//this will give blue and brown
        System.out.println(super.color);//blue, brown, black
    }
}
class FuritureTester{
    public static void main(String[] args) {
        Chair chair=new Chair();
            chair.printColor();

    }
}
