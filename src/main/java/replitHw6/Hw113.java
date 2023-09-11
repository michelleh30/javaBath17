package replitHw6;

/*Step1: Create a method that will accept with 2 parameters of integer type

Step2: Write the logic in that method in println statement to print hours and minutes

Step3: Call the method

**Expected Output:**

```
11:30

 */
public class Hw113 {
    void time(int hours, int mins) {
        System.out.println(hours + ":" + mins);

    }

    public static void main(String[] args) {
        Hw113 clock=new Hw113();
        clock.time(11,30);
    }
}
