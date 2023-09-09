package replitHw6;

/*Given the following inputs:
String s;

Write a for loop that will print out the reverse of the string.


Sample input/outputs:

```
In: manhattan

nattahnam
```

```
In: processor
```

```
rossecorp
```

```
In: racecar
```

```
racecar
```

 */
public class Hw100 {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter a word");
        //String s = scanner.nextLine();

        String s="manhattan";

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i)+"");

        }


    }
}
