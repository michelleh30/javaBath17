package class22;

public class Fish implements Prey,Predator {
    @Override
    public void hunt() {
        System.out.println("This fish is hunting smaller fish");
    }

    @Override
    public void flee() {
        System.out.println("This fish is hunting bigger fish");

    }

    public static void main(String[] args) {
        Fish fish=new Fish();
        fish.hunt();
        fish.flee();
    }
}
