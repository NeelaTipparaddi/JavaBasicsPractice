public class PlayingCat {
    public static void main(String[] args) {

        System.out.println(isCatPlaying(false,43));
    }
//        public static boolean isCatPlaying(boolean summer, int temperature){
//            if(summer&&temperature>24&&temperature<46){
//                return summer;
//            }
//            return temperature>24&&temperature<36;
//        }
//    }
//OR

        public static boolean isCatPlaying(boolean summer, int temperature) {

            int max = summer ? 45 : 35;
            return temperature >= 25 && temperature <= max;
        }
    }
