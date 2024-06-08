public class SpeedConverter {
    public static void main(String[] args) {

        printConversion(10.25);

    }
        public static long toMilesPerHour(double kilometerPerHour){
            if(kilometerPerHour<0){
                return -1;
            }

            return Math.round(kilometerPerHour/1.609);

        }
        public static void printConversion(double kilometerPerHour){
            if(kilometerPerHour<0){

                System.out.println("Invalid Value");
                return;
            }
            long milesPerHour = toMilesPerHour(kilometerPerHour);
            System.out.println(kilometerPerHour + " km/h = " + milesPerHour + " mi/h");

        }
    }


