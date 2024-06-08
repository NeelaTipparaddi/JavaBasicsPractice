public class DayOfTheWeek {
    public static void main(String[] args) {
//        int day = 4;
//        System.out.println("Day " + day + " = " + printDayOfTheWeek(day));
        //System.out.println("Day " + day + " = " + printWeekDay(day));
        printDayOfTheWeek(4);
    }

    public static void printDayOfTheWeek(int day) {
        //return switch(day){
        String dayOfWeek = switch (day) {
            case 0 -> {
                yield "Sunday";
            }
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Satuarday";
            default -> "Invalid Day";
        };
    //};
        System.out.println(day +" Stands for " + dayOfWeek);
    }
}







//        public static String printWeekDay(int day){
//            if (day == 0) {
//                return "Sunday";
//            }
//            else if (day == 1) {
//                return "Monday";
//            } else if (day == 2) {
//                return "Tuesday";
//            }
//            else if (day == 3) {
//                return "Wednesday";
//            }
//            else if (day == 4) {
//                return "Thursday";
//            }
//            else if (day == 5) {
//                return "Friday";
//            }
//            else if (day == 6) {
//                return "Satuarday";
//            }
//            else return "Invalid Day";
//
//        }
//    }

