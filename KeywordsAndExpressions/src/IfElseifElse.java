public class IfElseifElse {
    public static void main(String[] args) {

        boolean gameOver = false;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;

        if(gameOver){
            finalScore += (levelCompleted*bonus);
            System.out.println("Your final score was " + finalScore);
        }
        else if(!gameOver){
            finalScore -= (levelCompleted*bonus);
            System.out.println("Your final score was " + finalScore);
        }
        else {
            System.out.println("Good Bye");
        }

    }
}
