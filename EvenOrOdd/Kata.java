public class Kata {

    public static void main(String[] args) {
        String result = evenOrOdd(8);
        System.out.println(result);
    }
    public static String evenOrOdd(int number) {
        if (number % 2 == 0){
            return "Even";
        } else {
            return "Odd";
        }

    }
}