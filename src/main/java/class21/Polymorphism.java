package class21;
/*
many forms of method
many version of the same method
has to be same exact method and same time of parameters
 */

class Bird {
    public void sing() {
        System.out.println("tweet tweet tweet");
    }
}
class Robin extends Bird{
    public void sing() {
        System.out.println("twiddlwledeedee");
    }
    }
class Pelican extends Bird{
    public void sing() {
        System.out.println("KWAAH KWAAH");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Pelican b=new Pelican();
        b.sing();
    }
}
