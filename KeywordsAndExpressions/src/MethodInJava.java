public class MethodInJava {
    public static void main(String[] args) {

        //voidMethod

//        calculateScore();
//    }
//
//    public static void calculateScore() {
        boolean gameOver;
        int score;
        int levelCompleted;
        int bonus;
//
//        int finalScore = score;
//
//        if (gameOver) {
//            finalScore += (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }


        //Method with parameters and arguments

        //int highScore = calculateScore(false, 10000, 8, 10);   //used variable
        System.out.println("highScore is " +calculateScore(false, 10000, 8, 10));  //withount variable

        gameOver=true;
        score =500;
        levelCompleted=5;
        bonus=70;
       System.out.println("HighScore is "+calculateScore(gameOver, score,levelCompleted,bonus));


    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (!gameOver) {
            finalScore += (levelCompleted * bonus);
            // System.out.println("Your final score was " + finalScore);
        }
        return finalScore; //Return key word

    }

}