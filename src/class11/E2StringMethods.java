package class11;
//loop to get characters
//count how many "a" are there and print
public class E2StringMethods {
    public static void main(String[] args) {

        String str="Batch 17 is A great. just kidding. Please ";//this can be a array, each letter has a num


        int count=0;
        for (int i = 0; i <str.length() ; i++) {

            if(str.charAt(i)=='a' || str.charAt(i)=='A'){
                count++;//count++ basically means that for every "a" increment it by one
            }

        }
        System.out.println(count);

    }

}
