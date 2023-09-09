package class18;
//Create a Bird class create 4 fields and use the
//Bird class as parent class and create 2 classes
//Using it one sparrow and one parrot use constructors make fields private
// and define printInfo methods as well create the object of each class and
// call the methods
public class Bird {
  protected String color;

  protected char gender;
  protected int weight;
  protected String typeOfBird;

  public Bird(String color,char gender,int weight,String typeOfBird){
      this.color=color;
      this.gender=gender;
      this.weight=weight;
      this.typeOfBird=typeOfBird;
  }
  void printInfo(){
      System.out.println(color+" "+gender+" "+weight+" "+typeOfBird);
  }

}
class Sparrow extends Bird{

    public Sparrow(String color,char gender,int weight,String typeOfBird){
        super(color,gender,weight,typeOfBird);


    }
}
class Parrot extends Bird{

    public Parrot(String color,char gender,int weight,String typeOfBird){
        super(color,gender,weight,typeOfBird);


    }
}
class birdTester{
    public static void main(String[] args) {
        Sparrow s1=new Sparrow("blue",'M',5,"BlueJay");
        s1.printInfo();


    }
}


