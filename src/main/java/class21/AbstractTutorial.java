//Abstract methods is a method that isn't implemented yet--
//implemented-- putting things into the code System.out.println("bark");inside the()
//help us organized what a dog should have, what should this class be able to do
//it saying that you have to implement your own pooh method b/c every dog does it differently but
//all the dogs will bark that same-- because we already implemented below

package class21;
abstract class Dog{
    public void bark(){
        System.out.println("Bark!");//("Bark!") is being implemented
    }
    public abstract void poop();//this is a abstract method doesnt know what to do when its called, so we have to tell it what to do, it's not implemented
}

class Chihuahua extends Dog{
    public void poop(){
        System.out.println("Dog pooped!");//now its being called,now it know that it needs to poop, its implemented
    }
}


public class AbstractTutorial {
    public static void main(String[] args) {
        Chihuahua c=new Chihuahua();
        c.bark();
        c.poop();

    }
}
