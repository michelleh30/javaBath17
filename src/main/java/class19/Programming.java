package class19;
//Create a class named 'Programming'. While creating an object of the class,
// if nothing is passed to it, then the message "I love programming languages"
// should be printed. If some String is passed to it, then in place of "programming languages"
// the value variable should be printed. Example, if we pass "Java",
// then "I love Java" should be printed.

//it is not assigned to a variable
        //but it is creating an objec
public class Programming {
    public Programming(){//no parameters
        System.out.println("I love programming languages");
    }
    public Programming(String word){
        System.out.println("I love "+word);
    }

    public static void main(String[] args) {
        new Programming();//this one calls the 1st one---no parameters
        new Programming("Java");//print out the 2nd one
    }
}
