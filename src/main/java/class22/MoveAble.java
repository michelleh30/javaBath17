package class22;
//by defuly all the feil inside are public static final
public interface MoveAble {
   void move();//abstract everyone moves differently--method, this is not have a body



}
interface Washable{
    void wash();

}

 class Dog implements MoveAble,Washable{//impamenting different interfaces
     public void move(){
         System.out.println("Dogs can jump run and can move");
     }

     @Override
     public void wash() {
         System.out.println("You can wash a dog");
     }
 }
class Car implements MoveAble,Washable{//we are able to inhera implametn diff interface
    @Override
    public void move(){
        System.out.println("Car can move forward backward and can go in circles");
    }

    @Override
    public void wash() {
        System.out.println("we can wash a car");
    }
}