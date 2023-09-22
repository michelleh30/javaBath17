package review10;
/*private and protected word not allow
all keyword are public
interface class modifiers are public, static and final
is by default abstract
no instance variable in a interface
no constructors--they initialize instance var and we don't have them
no final--b/c we have to implement into other class Final is completed
method are abstract, they cant have a body it will not work line 16

 */
public interface Human {
    int MAX_AVG_AGE=100;//default
    public static final String name="John";

    //public void eat(){
        //this method has a body
    //}
        void eat();
}
