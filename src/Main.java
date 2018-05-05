public class Main {

    public static void main(String[] args) {

        int nmber = 4;

        System.out.println(sum(nmber));

        System.out.println(factorial(nmber));

        System.out.println(power(2,3));


    }

    public static int sum(int nmbr){

        if (nmbr==1) return 1;

        return nmbr + sum(nmbr-1);


    }

    public static int factorial(int nmbr){

        if (nmbr==1) return 1;

        return nmbr * factorial(nmbr-1);

    }

    public static int power(int nmbr, int xpnt){

        if (xpnt==1) return nmbr;

        return nmbr * power(nmbr, xpnt-1);

    }

}
