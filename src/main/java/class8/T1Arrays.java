package class8;
// when doing reverse order you have to do .length-1 if not it will be error
//index is always 1 less then the size thats why you subtracr -1
//chars.length will give you 7,but theres no index 7, index is 6
public class T1Arrays {
    public static void main(String[] args) {
        char[] chars={'A','b','c','F','E','#','@'};// theres 7 elements,that why you have to subtract -1
            //         0   1   2   3   4   5   6
        for (int i = chars.length-1; i >=0; i--) {
            System.out.println(chars[i]);

        }
    }
}
