import java.util.Scanner;

public class NumbersDemo2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer 1");
        int one = input.nextInt();

        System.out.println("Enter integer 2");
        int two = input.nextInt();

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

