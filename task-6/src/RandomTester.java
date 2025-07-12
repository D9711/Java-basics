import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class RandomTester {

    public static ArrayList<Integer> generateNumbers(int n) {

        ArrayList<Integer> generateNumbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            generateNumbers.add(random.nextInt(n));

        }

        return generateNumbers;

    }

    public static ArrayList<Integer> shuffle(ArrayList<Integer> list) {

        ArrayList<Integer> shuffle = new ArrayList<>();

        for (int element : list) {

            shuffle.add(element);
            Collections.shuffle(shuffle);
        }

        
        return shuffle;

    }

    public static ArrayList<Dice> sequenceOfDice(int n) {

        ArrayList<Dice> sequenceOfDice = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            sequenceOfDice.add(new Dice());

        }

        System.out.println("Sequenslist of Dices " + sequenceOfDice);
        return sequenceOfDice;
    }

    public static int highestAdjacentRolls(ArrayList<Dice> sequence) {

        ArrayList<Integer> dices = new ArrayList<>();
        int highestAdjacentRolls = 0;

        for (Dice element : sequence) {

            element.getValue();

            dices.add(element.getValue());
        }

        for (int i = 0; i < dices.size(); i++) {

            if (i == dices.size() - 1) {

                break;
            } else if (highestAdjacentRolls < (dices.get(i) + dices.get(i + 1))) {

                highestAdjacentRolls = (dices.get(i) + dices.get(i + 1));
            }

        }

        System.out.println("Highest adjacent roll: " + highestAdjacentRolls);
        System.out.println("Highest adjacent roll: " + dices);
        return highestAdjacentRolls;

    }

    public static int smallestAdjacentRolls(ArrayList<Dice> sequence) {

        ArrayList<Integer> dices = new ArrayList<>();
        int smallestAdjacentRolls = 12;

        for (Dice element : sequence) {

            element.getValue();

            dices.add(element.getValue());
        }

        for (int i = 0; i < dices.size(); i++) {

            if (i == dices.size() - 1) {

                break;
            } else if (smallestAdjacentRolls > (dices.get(i) + dices.get(i + 1))) {

                smallestAdjacentRolls = (dices.get(i) + dices.get(i + 1));
            }

        }

        System.out.println("Lowest adjacent roll: " + smallestAdjacentRolls);
        System.out.println("Lowest adjacent roll: " + dices);
        return smallestAdjacentRolls;
    }

    public static ArrayList<Dice> remove(ArrayList<Dice> sequence, int n) {

        ArrayList<Dice> sequenceCopy = new ArrayList<>();

        sequenceCopy.addAll(sequence);

        Iterator<Dice> iterator = sequenceCopy.listIterator(n);

        while (iterator.hasNext()) {

            Dice number = iterator.next();
            iterator.remove();

        }

        System.out.println("afterRemoveTest " + sequenceCopy);
        return sequenceCopy;

    }

    public static void main(String[] args) {

        final int AMOUNT_OF_NUMBERS = 5;

        ArrayList<Integer> randomNumbers = generateNumbers(AMOUNT_OF_NUMBERS);
        ArrayList<Integer> shuffledRandomNumbers = shuffle(randomNumbers);
        ArrayList<Dice> sequenceOfDice = sequenceOfDice(AMOUNT_OF_NUMBERS);

        highestAdjacentRolls(sequenceOfDice(AMOUNT_OF_NUMBERS));
        smallestAdjacentRolls(sequenceOfDice(AMOUNT_OF_NUMBERS));
        remove(sequenceOfDice, 3);

        BiasedDice biasedDice = new BiasedDice();

        System.out.println("The following " + AMOUNT_OF_NUMBERS + " numbers were generated:");
        System.out.println("randomnumbers: " + randomNumbers);
        System.out.println("shuffled list " + shuffledRandomNumbers);

    }
}
