package class9;

//
public class E92DArrays {
    public static void main(String[] args) {

        String [] [] names=
                {       {"Hinda","Mikhail","Ismael","Ahmed" },
                        {"John", "Bob","Adam","Tamim" },
                        {"JOke","Laugh","John Ahmed","Mohammad"},
                        {"Gui","Backend","Front","API"}
                };
       // int [] num={10,20,30,40};

        //or(int n:num){//what does the array contain
            //System.out.println(n);
        //}

        for(String [] row:names){//nested enhance for loop
            for(String v:row){//data
                System.out.print(v+" ");
            }
            System.out.println();

            //System.out.println(Arrays.toString(row));all the array
        }

    }


}

