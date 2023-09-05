package class8;
//find the smallest number
public class T6EnhanceLoop {
    public static void main(String[] args) {
        int[] nums={10,77,25,56,60,20,-10,-5};

        int smallest=nums[0];
        for(int s:nums){
            if(s<smallest){
                smallest=s;
            }
        }
        System.out.println(smallest);


    }
}
