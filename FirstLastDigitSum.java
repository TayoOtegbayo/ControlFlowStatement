public class FirstLastDigitSum {
    public static void main(String[] args){
        sumFirstAndLastDigit(345);
    }


    // method to add the first and last digit of a number
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        }
        else{
            //for(int i=0; number.length; i++){
            int firstDigit = Integer.parseInt(Integer.toString(number).substring(0, 1));
            int lastDigit = number % 10;
            int sum = firstDigit+lastDigit;
            System.out.println("The sum is = " + sum);
            return sum;
        }
    }
}