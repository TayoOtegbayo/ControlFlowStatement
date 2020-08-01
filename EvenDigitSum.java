public class EvenDigitSum {
    public static void main(String[] args){
        getEvenDigitSum(2345);
    }

    //method to calculate the sum of the even numbers in a number
    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int sum = 0;
            int tmpResult = 0;
            int evenSum = 0;
            while (number > 0) {
                tmpResult = number % 10;
                number /= 10;
                if (tmpResult % 2 == 0 && tmpResult != 0) {
                    evenSum += tmpResult;

                } else {
                    continue;
                }

            }
            System.out.println("The sum of even number = "+ evenSum);
            return evenSum;
        }
        //System.out.println("The sum of even number in "+ number + " = "+ evenSum);

    }

}
