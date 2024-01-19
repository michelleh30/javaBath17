package class22;

public interface Predator {
    void hunt();

}
class Hawk implements Predator{

    @Override
    public void hunt() {
        System.out.println("the hawk is huanting");
    }

    public static void main(String[] args) {
        Hawk hawk=new Hawk();
        hawk.hunt();

    }
}
