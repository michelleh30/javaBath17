package class9;

public class T4 {
    public static void main(String[] args) {

        String [][] cars={
                {"Ford", "Cadillac", "Jeep", "Tesla"},
                {"BMW", "Audi", "Mercedes", "Volkwagen"},
                {"Kia", "Hyundai", "Sportage", "Genesis Motor"},
                {"Ferrari", "Lamborghini", "Maserati", "Fiat"}
        };

        //index for loop// index base loop
        for (int row = 0; row  < cars.length; row ++) {//theres 3 rows
            for (int col = 0; col <cars[row].length ; col++) {//4 colmus/elements
                System.out.print(cars[row][col]+" ");
            }
            System.out.println();

        }
        ///// Enhnace loop
        for(String [] r:cars){
            for(String c:r){
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}
