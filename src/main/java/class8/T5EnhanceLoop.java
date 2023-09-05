package class8;
//find the largest even number
public class T5EnhanceLoop {
    public static void main(String[] args) {
        int[] nums={10,77,25,56,60,20};

        int evenLargest=nums[0];
        for(int number:nums){

            if(number>evenLargest&& number%2==0){
                evenLargest=number;
            }

        }
        System.out.println(evenLargest);
    }
}
