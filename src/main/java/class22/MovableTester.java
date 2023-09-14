package class22;

public class MovableTester {
    public static void main(String[] args) {
        MoveAble []arr={new Dog(),new Car()};

        for(MoveAble a:arr){
            a.move();

            Washable[] arr1 = {new Car(), new Dog()};
            for (Washable b : arr1) {
                b.wash();

            }
        }
    }
}
