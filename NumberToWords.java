public class NumberToWords {
    public static void main(String[] args){
        numberToWords(34);
    }

    public static void numberToWords (int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }
        int reversedNumber = reverse(number);
        int countOfWhile = 0;
        int countOfDigits = getDigitCount(number);
        while (reversedNumber > 0){
            int digit = reversedNumber % 10;
            

            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }

            countOfWhile++;
            reversedNumber = reversedNumber / 10;
        }
        for (int i = countOfWhile; i < countOfDigits; i++){
            System.out.println("Zero");
        }

    }

    public static int reverse (int number){

        int reverse = 0;
        while (number != 0){
            reverse = (reverse * 10) + (number % 10);
            number /= 10;
        }
        return reverse;
    }
    public static int getDigitCount (int number){
        if (number < 0){
            return -1;
        }
        if (number == 0){
            return 1;
        }
        int count = 0;
        while (number > 0){
            number = number / 10;
            count++;
        }
        return count;
    }

}
