package class10;

public class PhoneTester {
    public static void main(String[] args) {
        Phone iphone=new Phone();
        iphone.brand="Apple";
        iphone.price=800;
        iphone.color="Purple";

        iphone.call();
        iphone.text();
        iphone.picture();

        Phone pixelObj=new Phone();
        pixelObj.brand="Google";
        pixelObj.price=699;
        pixelObj.text();
        pixelObj.call();



        Phone samsungObj=new Phone();
        samsungObj.brand="Samsung";
        samsungObj.price=1199;
        samsungObj.text();
        samsungObj.call();




    }



}
