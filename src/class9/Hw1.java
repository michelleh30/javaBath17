package class9;

public class Hw1 {
    public static void main(String[] args) {
        String[][] food = {
                {"Carrot", "Potato", "Onion", "Tomato"},
                {"Apple", "Kiwi", "Cherry", "Banana"},
                {"Milk", "Cream", "Cheese", "Yogurt"},
                {"Pie", "Cookies", "Ice Cream", "Chocolate"}
        };

        for (int i = 0; i < food.length; i++) {
            for (int j = 0; j < food[i].length; j++) {
                System.out.print(food[i][j] + " ");

            }
            System.out.println();
        }



    }
}
