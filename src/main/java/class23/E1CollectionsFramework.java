package class23;
//a lot of class interface that are all dymamic they can grown and get smaller
import java.util.Arrays;

public class E1CollectionsFramework {
    public static void main(String[] args) {

        String [] arr=new String [10000];//size
        arr[1]="Michelle";
        System.out.println(Arrays.toString(arr));
        //this is a waste of space because we put the size in
    }
}
