package class14;
//Create a method that will accept an array as parameters(input to the methods)
// and will return a sum of all elements from that array.
// Method should be visibly only within same package and accessible by the
// creating an instance/ obj of the class
//private =class
//default=same package
public class T2 {
    public static void main(String[] args) {
        T2 t2=new T2();
        int [] array={10,25,15};
        System.out.println(t2.getArrSum(array));
    }
   int getArrSum(int [] arr){//this is the method
       int sum=0;
      for(int n:arr){
           sum=sum+n;
       }
      return  sum;
   }


}
