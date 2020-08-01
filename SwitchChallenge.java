public class SwitchChallenge {

    public static void main(String[] args){
        //printDayOfTheWeek(2);
        getDaysInMonth(2,2000);
    }

    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

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

    public static int getDaysInMonth(int month, int year){
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
                    //isLeapYear(year);
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
            System.out.println(numOfDays);
         return numOfDays;
        }

        }

    }

