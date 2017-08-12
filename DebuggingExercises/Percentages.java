public class Percentages {

    public static void main(String[] args) {

        double one = 8;
        double two = 10;

        computePercent(one, two);
        computePercent(two, one);
    }
    public static void computePercent(double a, double b){
        double c = 100*(a/b);
        System.out.println(a + " is " + c + " percent of " + b);
    }
}
