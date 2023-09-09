package review7;
//new makes an object
public class Store {
    public static void main(String[] args) {
      System.out.println(Book.type);

      Book book1 =new Book();//book(); calling the const
        book1.title="nightwork";
        book1.author="Irwin shaw";
        book1.year=1975;
        book1.price=45;

        book1.read();
        book1.changePrice(41);
        double total=book1.totalWithTax(0.1);
        System.out.println("The price with taxes =" +total);


        Book book2=new Book();
        book2.title="cat in the hat";
        book2.author="abd";
        book2.year=1965;
        book2.price=7.99;


        }


    }

