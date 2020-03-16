package udemy.programming;

public class Main {

    public static void main(String[] args) {
        displayHighScorePosition("Varsha", calculateHighScorePosition(1500));
        displayHighScorePosition("X", calculateHighScorePosition(900));
        displayHighScorePosition("Y", calculateHighScorePosition(400));
        displayHighScorePosition("Z", calculateHighScorePosition(80));
    }

    static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on high score table.");
    }

    static int calculateHighScorePosition(int playerScore) {
        if (playerScore > 1000) {
            return 1;
        }
        if (playerScore > 500 && playerScore < 1000) {
            return 2;
        }
        if (playerScore > 100 && playerScore < 500) {
            return 3;
        }
        return 4;
    }
}
