package onesIDontKnow;
//#9 if the seconf largest number
public class one {
    public static void main(String[] args) {
        int[]number={1,2,3,4,5,6,7,8,12,56,34,66};
        int max=0;
        int secondLargest=0;
        for(int num:number){
            if(num>max){
                secondLargest=max;
                max=num;
            }else if(num>secondLargest){
                secondLargest=num;
            }
        }
        System.out.println("The second largest number is "+secondLargest);
    }
}
