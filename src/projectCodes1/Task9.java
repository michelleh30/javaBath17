package projectCodes1;
//Write a java program to find the second largest number in the array?
public class Task9 {
    public static void main(String[] args) {
        int [] nums={56,34,77,89,23};
        int secLargest;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j < nums.length; j++) {

                if(nums[i]>nums[j]){
                    secLargest=nums[i];
                    nums[i]=nums[j];
                    nums[j]=secLargest;
                }

            }

        }
        System.out.println(nums[nums.length-2]);


    }
}
