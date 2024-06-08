public class SecondsAndMinutes {
    public static void main(String[] args) {

        System.out.println(getDurationString(-373876));
        System.out.println(getDurationString(89, 15));
    }

    public static String getDurationString(int seconds) {
        if(seconds>=0) {
            int minutes = seconds / 60;
            seconds = seconds%60;
            return getDurationString(minutes, seconds);
        }
        return "Invalid Value";

    }

    public static String getDurationString(int minutes, int seconds) {
        if(minutes>=0 && seconds<=59) {

            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            //int remainingSeconds = seconds % 60;
            return hours + "h " + remainingMinutes + "m " + seconds + "s";
       }
        return "Invalid Value";
    }

}
