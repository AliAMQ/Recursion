public class Main {

    public static void main(String[] args) {
        int number = 4;
        System.out.println( "Sum of 1 to " + number + "is: " + sumSeries(number));
        System.out.println( "The factorial of " + number + "is: " + factorial(number));
        int base = 2;
        System.out.println( number + " to " + base + "is: " + power(base,number));
    }


    public static int sumSeries(int n){
        //stop case
        if (n==1){
            return 1;
        }
        //recursion case
        else{
            return n + sumSeries(n-1);
        }
    }

    public static int factorial(int n){
        //stop case
        if (n==1){
            return 1;
        }
        //recursion case
        else{
            return n * factorial(n-1);
        }
    }

    public static int power(int base, int exponent){
        //stop case
        if (exponent==1){
            return base;
        }
        //recursion case
        else{
            return base * power(base, exponent-1);
        }
    }

}
