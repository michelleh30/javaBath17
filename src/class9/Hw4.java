package class9;

//Create 2D array of countries: north america countries, south america countries,
// europe countries, asian countries, african countries.
// Then print all values from that array using 2 different loops
// and calculate how many total countries been stored.
public class Hw4 {
    public static void main(String[] args) {
        String[][] countries = {
                {"USA", "Canada", "Mexico"},
                {"Bolivia", "Brazil", "Peru", "Uruguay"},
                {"Italy", "Spain", "England", "Ireland"},
                {"Vietnam", "Japan", "Korea", "Thailand"},
                {"Ethiopia", "Angola", "Ghana", "Algeria"}
        };

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j <countries[i].length ; j++) {
                System.out.print(countries[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------");



        int sumCountries = 0;
        for (int i = 0; i < countries.length; i++) {
            sumCountries+=countries[i].length;

        }

        System.out.println(sumCountries);
    }


}

