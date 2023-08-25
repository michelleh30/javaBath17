package class6;
//print only odd number from 100 to 1; 2 different way
public class T11ForLoop {
    public static void main(String[] args) {


        for(int i = 99; i>-1; i-=2){
            System.out.print(i+" ");
        }

        int y=99;
        while (y>=1){
            System.out.print(y+" ");
            y-=2;
        }

    }
}
