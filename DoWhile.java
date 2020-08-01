public class DoWhile {
    public static void main(String[] args) {
        //isPalindrome(10);
        //getEvenDigitSum(2243);
        //isEvenNumber(34);
        //hasSharedDigit(55, 56);
        //hasSameLastDigit(22,23,34);
        isPerfectNumber(9);


        int start = 4;
        int end = 20;
        int evenNumberCount = 0;
        while (start <= end) {
            start++;

            if (isEvenNumber(start)) {
                evenNumberCount++;

                System.out.println("The even is " + start);
                if (evenNumberCount >= 5) {
                    break;
                }
            }

        }
        System.out.println("Even number count =" + evenNumberCount);

    }


    public static boolean isEvenNumber(int number) {
        while (number % 2 == 0) {
            //System.out.println("The number is even");
            return true;
        }
        //System.out.println("The number is an odd");
        return false;
    }


    public static boolean isPalindrome(int number) {
        int palindrome = number;
        int reverse = 0;
        while (palindrome != 0) {
            int lastDigit = palindrome % 10;
            reverse = reverse * 10 + lastDigit;
            palindrome = palindrome / 10;
        }

        // The integer is palindrome if integer and reverse are equal
        System.out.println("Palindrome number = " + reverse);
        return number == reverse; //
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
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
            System.out.println("The sum of even number = " + evenSum);
            return evenSum;
        }
        //System.out.println("The sum of even number in "+ number + " = "+ evenSum);

    }

    public static boolean hasSharedDigit(int number1, int number2) {
        if (number1 < 10 || number1 > 99 || number2 < 10 && number2 > 99) {
            return false;
        }
        int numberTwo = number2;
        // int temp1, temp2 = 0;
        while (number1 > 0) {
            int temp1 = number1 % 10;
            while (number2 > 0) {
                int temp2 = number2 % 10;
                if (temp1 == temp2) {
                    return true;
                }

                number2 /= 10;
            }

            number1 /= 10;
            number2 = numberTwo;
        }

        return false;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if ((num1 < 10 || num1 > 1000 || num2 < 10 || num2 > 1000 || num3 < 10 || num3 > 1000)) {
            return false;
        }
        int numTwo = num2;
        int numThree = num3;
        while (num1 >= 0) {
            int temp1 = num1 % 10;
            while (num2 >= 0) {
                int temp2 = num2 % 10;
                while (num3 >= 0) {
                    int temp3 = num3 % 10;
                    int tempNum3 = 0;
                    num3 = tempNum3;
                    if (temp3 == temp2 || temp3 == temp1) {
                        return true;

                    }
                    return false;

                }
                // return false;
            }
            //return false;

        }
        return false;
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;

            }
            continue;
        }
        if (sum < number) {
            return false;
        }
        return true;
    }



}

