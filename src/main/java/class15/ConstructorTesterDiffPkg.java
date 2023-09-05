package class15;

import class16.Constructor;

public class ConstructorTesterDiffPkg {
    public static void main(String[] args) {
        //new Constructor();
       //new Constructor("dnfdkj");
        //new Constructor(1512);
        new Constructor(10.52155);//this create an obj
        Constructor t=new Constructor(12.34);//this create an obj but store it in the "t"
        //only public and protected will work in a different package
    }
}
