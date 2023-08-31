package class13;

public class E2InstanceVar {
    String name = "Michelle";

    void printAge() {
        int age = 25;
        System.out.println(age);
        System.out.println(name);
        System.out.println(country);

    }

    void printCountry() {
        System.out.println(name);
        System.out.println(country);
        if (10 > 5) {
            System.out.println(country);
        }
    }

    static String country = "Uganda";


}

