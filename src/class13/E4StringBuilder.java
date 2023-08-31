package class13;

public class E4StringBuilder {
    public static void main(String[] args) {

        String str=new String("Habib");
        String name="Habib";// we can do this oine its shorter


        StringBuilder stringBuilder=new StringBuilder("Michelle");//always have to wrtie this
        //stringBuilder.reverse();
        //System.out.println(stringBuilder);
        //stringBuilder.deleteCharAt(1);
        //System.out.println(stringBuilder);
        stringBuilder.append("d");//this add the d
        System.out.println(stringBuilder);
    }
}
