package class8;
//while loop
//element 6
// index 5
public class E2Arrays {
    public static void main(String[] args) {

        boolean [] conds={true,false,true,false,true,true};
                      //  0      1    2    3     4    5
        int i=0;
        while(i<conds.length){//no = b/c it will think that theres 6 when theres only 5
            System.out.println(conds[i]);
            i++;
        }
    }
}
