package class9;

public class E22DArrays {
    public static void main(String[] args) {
        String [] [] names=//2D
                {       {"Hinda","Mikhail","Ismael","Ahmed" },//1st row
                        {"John", "Bob","Adam","Tamim" },//2nd row
                        {"JOke","Laugh","John Ahmed","Mohammad"},//3rd row
                        {"Gui","Backend","Front","API"}//4th row
                };

        //String[] row=names[1];//--the number put inside[] will print out the row
        //System.out.println(row[0]);//this will print out John
        //System.out.println(Arrays.toString(firstRow));//this will print out the whole first row

                String[] row=names[1];//
                for(String name:row){//row is 1D
                System.out.println(name);// this will print out the whole 1st row
        }
    }
}
