public class LeapYear {

    public static void main(String[] args) {

        if(isLeapYear(2100)){
            System.out.println("The year entered is Leap Year");
        }
        else
            System.out.println("The year entered is not a Leap Year");
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999){
            return true;
        }

        if(year % 4 ==0  && year%100!=0 ) {
                return true;
            }
        else if (year % 100 ==0  && year%400==0 ){
            return true;
        }
            else
                return false;
        }
    }

//2nd method

//public class LeapYear {
//
//    public static boolean isLeapYear(int year) {
//        if (year < 1 || year > 9_999) {
//            return false;
//        }
//
//        if (year % 4 == 0) {
//            if (year % 100 != 0) {
//                return true;
//            } else {
//                if (year % 400 == 0) {
//                    return true;
//                } else {
//                    return false;
//                }
//            }
//        } else {
//            return false;
//        }
//    }
//}



