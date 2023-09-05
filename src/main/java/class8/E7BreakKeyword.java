package class8;
//you have to search the array for number 45 it is present in the array
// print found or else do nothing
public class E7BreakKeyword {
    public static void main(String[] args) {

        int [] nums={10,23,25,56,45,20};

        for (int n:nums){
            if(n==45){
                System.out.println("Found");
            }
        }

    }
}
