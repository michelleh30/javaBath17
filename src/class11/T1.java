package class11;
//Create a String and if the String is not empty perform the following:
//if the String has an odd number of characters and has 3 or more characters,
//print the character in the middle of the String.
//For Example String str=hello =>l
public class T1 {
    public static void main(String[] args) {

        String name="Diana";
        if(!name.isEmpty()){

            if(name.length()%2!=0&&name.length()>=3){//this makes a odd(%2!==0
                int middle=name.length()/2;//this will get middle letter,you always / 2 to get middle
                System.out.println(name.charAt(middle));

            }
        }



    }
}
