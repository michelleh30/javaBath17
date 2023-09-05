package class13;
//method?
public class E3LocalDemo {
    //int sum=0;//instane var. will still give the same answer 60 but its better to use local
    void addElements(){
        int [] arr={10,20,30};
        int sum=0;

        for (int i = 0; i <arr.length ; i++) {
            sum=sum+arr[i];

        }
        System.out.println(sum);


        }
    }

