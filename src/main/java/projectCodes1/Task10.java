package projectCodes1;

//Write a program to print out duplicate elements from an Array of
//Strings?
public class Task10 {
    public static void main(String[] args) {
        String[] names = {"Michelle", "Nelson", "Valentina", "Michelle", "Rosa"};

        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i] == names[j]) {
                    System.out.println("Duplicate name is " + names[i]);
                }

            }
        }


    }
}
