package replitHw9;

public abstract class Tea {
    String teaType;

    public Tea(String teaType){
        this.teaType=teaType;
    }
    abstract void addSugar();
}

class LemonTea extends Tea{
    public LemonTea(String teaType){
        super(teaType);
    }
    @Override
    public void addSugar(){
        System.out.println("For "+teaType+" we need 2 spoons of sugar");

    }

}

class ChaiTea extends Tea{

    public ChaiTea(String teaType){
        super(teaType);

    }
    @Override
    public void addSugar(){
        System.out.println("For "+teaType+" we need 1 spoon of sugar");
    }

}

