package class16;
//Write a Book class that will have instance variable and 2 constructor.
// While creating an obj make sure: Instance var are being initialized and
// both constructors are bring executed

public class Book {
    private String title;
    private int year;

    private double price;

    public Book(String title, int year){
        this.title=title;
        this.year=year;
    }
    public Book(String title, int year,double price){
        this(title,year);
        this.price=price;
    }
    public void printInfo(){
        System.out.println(title+" "+year+" "+price);
    }

    public static void main(String[] args) {
        Book b1=new Book("Twlight",2005);
        b1.printInfo();

        Book b2=new Book("The Cat in The Hat",1957,7.99);
        b2.printInfo();



    }



}
