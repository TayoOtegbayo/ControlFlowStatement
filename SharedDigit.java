public class SharedDigit {
    public static void main(String[] args){
        hasSharedDigit(23,32);
    }
    // method to return the digit that is common to two numbers
    public static boolean hasSharedDigit(int numA,int numB){
        if((numA<10||numA>99)||(numB<10||numB>99)){
            return false;
        }
        int realNumB=numB;
        while(numA>0){
            int numADig=numA%10;
            while(numB>0){
                int numBDig=numB%10;
                if(numADig==numBDig){
                    return true;
                }
                numB=numB/10;
            }
            numA=numA/10;
            numB=realNumB;
        }
        System.out.println(numB);
        return false;
    }
}