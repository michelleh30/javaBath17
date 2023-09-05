package class7;
//Create an array of animals and store 5 elements into it.
// Using 2 different loops print all elements from the array.
public class Hw5 {
    public static void main(String[] args) {


        String [] animal={"Dog", "Cat", "Pig","Worm","Bird"};//number is iteams in the array
        for (int i = 0; i < animal.length ; i++) {
            System.out.print(animal[i]+" ");
        }

        int i=0;//starting point
        while(i<animal.length) {//ending point. the = b/c i want to see 30
            System.out.println(i);
            i++;// i++; i+=5; steps


        }

    }
}
