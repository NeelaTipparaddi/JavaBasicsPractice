public class displayHighScorePosition {
    public static void main(String[] args) {

        int highScore = calculateHighScorePosition(25);
        displayHighScorePosition("Tim", highScore);

        highScore = calculateHighScorePosition(100);
        displayHighScorePosition("Bob", highScore);

        highScore = calculateHighScorePosition(500);
        displayHighScorePosition("Tom", highScore);

        highScore = calculateHighScorePosition(1000);
        displayHighScorePosition("Sham", highScore);

        highScore = calculateHighScorePosition(1500);
        displayHighScorePosition("Ram", highScore);
    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position;
        if (playerScore >= 1000) {
            //return 1;
            position = 1;
        } else if (playerScore >= 500) {
            //return 2;
            position = 2;
        } else if (playerScore >= 100) {
            // return 3;
            position = 3;
        } else {
            //return 4;
            position = 4;
            // }
        }
        return position;
    }
}
