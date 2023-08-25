package class7;
//nested while loop
public class E4NesterLoop {
    public static void main(String[] args) {

        int y = 1;
        while (y<=3) { //3 rows
            int x = 1;
            while (x <= 20) {//20 = on each row
                System.out.print("=");
                x++;
            }
            System.out.println();
            y++;

        }

    }
}
