package class7;
/*  1 2 4 5 6
    1 2 4 5 6
    1 2 4 5 6
    1 2 4 5 6
not num 3
 */
public class T2NestedLoop {
    public static void main(String[] args) {

        for (int i = 0; i <4 ; i++){
            for (int j = 1; j < 7; j++) {
                if(j!=3){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }


    }
    }

