public class AdvancedSwitch {

    public static void main(String[] args) {
        System.out.println(getQuater("April"));
    }
    public static String getQuater(String month){
        return switch(month){
            //case "January","February","March" -> "1st";
            case "January","February","March" ->{yield "1st";}
            case "April","May","June" -> "2nd";
            case "July","August","September" -> "3rd";
            case "October","November","December" -> "4th";
            //default -> "Bad";
            default ->{
                String badResponse = month + "is bad";
                yield badResponse;
            }
        };
    }
}
