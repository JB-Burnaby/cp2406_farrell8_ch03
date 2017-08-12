import java.util.Scanner;

public class Percentages2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number.");
        double one = input.nextDouble();
        System.out.println("Enter the second number");
        double two = input.nextDouble();

        computePercent(one, two);
        computePercent(two, one);
    }
    public static void computePercent(double a, double b){
        double c = 100*(a/b);
        System.out.println(a + " is " + c + " percent of " + b);
    }
}

