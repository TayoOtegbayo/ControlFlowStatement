public class LastDigitChecker {
    public static void main(String[]args){
        hasSameLastDigit(23,45,64);
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if((num1 < 10 || num1 > 1000 || num2 < 10 || num2 > 1000 || num3 < 10 || num3 > 1000)){
            return false;
        }
        int numTwo = num2;
        int numThree = num3;
        while(num1>=0){
            int temp1 = num1 % 10;
            while(num2>=0){
                int temp2 = num2 % 10;
                while(num3>=0){
                    int temp3 = num3 % 10;
                    int tempNum3 = 0;
                    num3 = tempNum3;
                    if(temp3==temp2 || temp3==temp1){
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
    public static boolean isValid(int number){
        if (number >= 10 && number <= 1000){
            return true;
        }
        return false;
    }
}