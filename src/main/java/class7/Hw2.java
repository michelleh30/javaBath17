package class7;
//Create an array of names and store all names of your group.
// Then print your name from that array. (use 2 different ways of creating an array).
public class Hw2 {
    public static void main(String[] args) {
        String [] names={"Michelle", "Clare","Avis","Uzair","Olalekan","Matiullah",};
        System.out.println(names[0]);

        String[]name1=new String[6];
        name1[0]="Michelle";
        name1[1]="Clare";
        name1[2]="Avis";
        name1[3]="Uzair";
        name1[4]="Olalekan";
        name1[5]="Matiullah";
        System.out.println(name1[1]);
    }
}
