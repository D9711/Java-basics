import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DiceGame extends RandomTester {

    public static FileWriter writer;

    public static void throwDice(String username, int numDice) {

        ArrayList<Dice> numDiceArray = sequenceOfDice(numDice);

        try {

            writer.write("Username: " + username);
            writer.write("" + numDiceArray);

            writer.flush();
            writer.close();

        } catch (Exception e) {

        }

    }

    public DiceGame() {

        try {
            writer = new FileWriter("dicethrows.txt", false);

            System.out.println("Successfully written");

        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    public static void main(String[] args) {

        DiceGame test = new DiceGame();
        throwDice("Parmhed", 4);

    }
}
