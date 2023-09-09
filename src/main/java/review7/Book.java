package review7;

public class Book {
    String title;
    String author;
    int year;
    double price;

    static int totalBook;
    static String type="Audiobook";

    //this is methods
    //retuenType name
    //void read()---if you dont want to return a type
    void read(){//this is w/o parameters, doesnt retuen anything
        System.out.println("I am reading "+title+" book by" +author);
    }
    void changePrice(int newPrice){
        System.out.println("The price of the book" +title+" was changed from" +price+ " to"+newPrice );
    }

    double totalWithTax(double tax){//method, return something
        double total = price+(price*tax);
        return total;

    }
}
