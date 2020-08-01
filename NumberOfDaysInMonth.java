public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        isLeapYear(2000);
        getDaysInMonth(2, 2000);
    }
    //method to determine if a year is a leap year or non-leap year
    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999){
            if (year%4 == 0){
                if (year % 100 == 0){
                    if(year%400 == 0){
                        return true;
                    }
                    return false;
                }
                return true;
            }

            return false;

        }
        return false;
    }

    public static int getDaysInMonth(int month, int year){ //method to get numbers of days in a month
        if(month<1 || month >12 || year < 1 || year > 9999 ){
            return -1;
        } else{
            int numOfDays = 0;
            switch(month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    numOfDays = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    numOfDays = 30;
                    break;
                case 2:

                    if(isLeapYear(year)==true){
                        numOfDays=29;
                    }
                    else
                    {
                        numOfDays=28;
                    }
                    break;
                default:
                    System.out.println("Invalid month.");
                    break;
            }
            return numOfDays;
        }

    }

}
