package class19;



class Parents{
    void marry(){
        System.out.println("We want to marry Salma");
    }
}
public class Ali extends Parents {
    void marry(){//the child can override
        System.out.println("I want to marry Tylor Swift");
    }
}
