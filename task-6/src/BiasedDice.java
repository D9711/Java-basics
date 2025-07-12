import java.util.Random;

public class BiasedDice extends Dice {

    private int probability = 0;

    public int getProbability() {

        return probability;
    }

    public void setProbability(int newProbability) {

        probability = newProbability;
    }

    public BiasedDice() {

        Random random = new Random();

        setProbability(random.nextInt(100) + 1);
        System.out.println("Probability " + getProbability());

        if (getProbability() > 50) {

            setValue(6);
            System.out.println("ThrowBiased: " + getValue());

        } else {

            setValue(random.nextInt(5) + 1);
            System.out.println("ThrowBiased: " + getValue());

        }

    }

}
