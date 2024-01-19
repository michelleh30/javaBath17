package class22;

public interface Prey {
    void flee();

}
class Rabbit implements Prey{

    @Override
    public void flee() {
        System.out.println("the rabbit is fleeing ");
    }

    public static void main(String[] args) {
        Rabbit rabbit=new Rabbit();
        rabbit.flee();
    }
}
