package MakeUpperCase;

public class Upper {
    public static void main(String[] args) {
        String result = MakeUpperCase("Alert !");
        System.out.println(result);
    }

    public static String MakeUpperCase(String str){
        return str.toUpperCase();
    }
}
