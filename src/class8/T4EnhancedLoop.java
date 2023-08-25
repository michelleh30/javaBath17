package class8;
//which number is the biggest number
public class T4EnhancedLoop {
    public static void main(String[] args) {

        int [] nums={10,23,25,56,45,20};

        int largest = nums[0];// its better to do x[0] to get the correct answer, the number use has to come from the array
        for(int n : nums){//gives you all the numbers

            if(n>largest){
                largest = n;
            }

        }
        System.out.println(largest);

    }
}
