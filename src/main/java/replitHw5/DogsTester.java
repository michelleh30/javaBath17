package replitHw5;

public class DogsTester {
    public static void main(String[] args) {
        Dogs Husky=new Dogs();
        Husky.breed="Husky";
        Husky.name="Rose";
        Husky.color="Black";

        System.out.print(Husky.breed);
        Husky.bark();
        System.out.print(Husky.breed);
        Husky.run();
        System.out.print(Husky.breed);
        Husky.play();


        Dogs Bulldog=new Dogs();
        Bulldog.breed="Bulldog";
        Bulldog.name="Mike";
        Bulldog.color="White";

        System.out.print(Bulldog.breed);
        Bulldog.bark();
        System.out.print(Bulldog.breed);
        Bulldog.run();
        System.out.print(Bulldog.breed);
        Bulldog.play();

        Dogs Labrador=new Dogs();
        Labrador.breed="Labrador";
        Labrador.name="Jib";
        Labrador.color="Brown";

        System.out.print(Labrador.breed);
        Labrador.bark();
        System.out.print(Labrador.breed);
        Labrador.run();
        System.out.print(Labrador.breed);
        Labrador.play();


    }
}
