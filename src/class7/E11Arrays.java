package class7;
//creating the array and also initializing// size cant be change but value can ex. kiwi to mango
public class E11Arrays {
    public static void main(String[] args) {

        String [] fruit={"Apple", "Orange", "Banana","Kiwi","Pineapple"};//number is iteams/variables in the array

       fruit[3]="Mango";// this changed the kiwi to mango


        for (int i = 0; i < fruit.length ; i++) {// number of variables
            System.out.println(fruit[i]);

        }


    }

}
