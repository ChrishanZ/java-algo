package MakeUpperCase;

public class Upper {
    public static void main(String[] args) {
        String result = makeUpperCase("Alert !");
        System.out.println(result);
    }

    public static String makeUpperCase(String str){
        return str.toUpperCase();
    }
}
