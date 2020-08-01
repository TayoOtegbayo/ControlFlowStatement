public class LargestPrimeFactor {

    public static void main (String[] args){
        getLargestPrime(21);
        getLargestPrime(321);
        getLargestPrime(34);
        getLargestPrime(2);
    }

    public static int getLargestPrime(int number) {
        int i;

        if (number<=1){
            return -1;
        }else {
            System.out.print("The largest prime factor of " + number);
            for (i = 2; i <= number; i++) {
                if (number % i == 0) {
                    number =number/i;
                    i--;

                }
            }
            System.out.println(" is " + i);
            return i;

        }


    }
}