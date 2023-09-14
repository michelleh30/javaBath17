package replitHw7;
/*
Create two methods:

The first method should be a non-static method that will print out the following message:

"Programming is amazing."

The second method should be a static method that will print out the following message:

"Java is awesome."

Execute both methods

**Expected Output:**

```
Programming is amazing.
```

```
Java is awesome.
 */
public class Hw127 {
   void s1(){
        System.out.println("Programming is amazing.");//non-static method, instance
    }
    static void s2(){
        System.out.println("Java is awesome.");//static method
    }

    public static void main(String[] args) {
        Hw127 s=new Hw127();
        s.s1();
        s2();
    }
}
