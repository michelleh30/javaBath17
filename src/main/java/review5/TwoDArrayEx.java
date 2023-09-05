package review5;

public class TwoDArrayEx {
    public static void main(String[] args) {

        String [][]countries={
                                {"Canada","USA"},//0
                                {"Ecuador","Brazil","Chile","Bolivia"},//1
                                {"Romania","France","Italy"}//2
        };
        System.out.println(countries.length);//number of 1Darrays, how many did you store its 3

        //enhance for loop
        for(String countryArray[]:countries){//outer loop iterates over 1D array

            for(String country:countryArray){//inner loop iterates over each element INSIDE THAT 1D

                System.out.println(country);
            }


        }

    }
}
