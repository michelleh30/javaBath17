package review11;

import java.util.ArrayList;

public class E2ArrayList {
    public static void main(String[] args) {

        int [] numbers=new int[10];//size is a must
        //its a arraylist of Integer
        ArrayList<Integer> nums=new ArrayList<>(10000);//its only Integers,what ever you put <> the methods will change
        // / no size in this array
        nums.add(10);
        nums.add(15);
        nums.add(45);
        nums.add(50);
        System.out.println(nums);//print out the list

        nums.remove(new Integer(45));//remove 45
        System.out.println(nums);

        ArrayList<String> names=new ArrayList<>();
        names.add("michelle");
        names.add("rosa");
        names.remove(1);//remove rosa
        System.out.println(names);
    }
}
