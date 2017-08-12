public class NumbersDemo {

    public static void main(String[] args){
        int one = 10;
        int two = 20;

        displayNumberPlusFive(one);
        displayNumberPlusFive(two);

        displayNumberSquared(one);
        displayNumberSquared(two);

        displayTwiceTheNumber(one);
        displayTwiceTheNumber(two);
    }

    public static void displayTwiceTheNumber(int a){
        System.out.println(a*2);
    }

    public static void displayNumberPlusFive(int a){
        System.out.println(a+5);
    }
    public static void displayNumberSquared(int a){
        System.out.println((a*a));
    }
}
