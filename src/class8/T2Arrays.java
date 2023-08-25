package class8;
//while loop
//how many trues and print them
//index is 5
public class T2Arrays {
    public static void main(String[] args) {

        boolean [] conds={true,false,true,false,true,true};//conds gives 6
                       // 0      1    2    3    4     5
        int count=0;

        for (int i = 0; i < conds.length; i++) {

            if(conds[i]){
                count++;// value plus 1

            }
        }
        System.out.println(count);
    }
}
