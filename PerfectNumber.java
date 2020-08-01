public class PerfectNumber {
    public static void main(String[] args){
        isPerfectNumber(24);
    }
    // write your code here
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
        if(sum<number){
            return false;
        }
        return true;
    }
}