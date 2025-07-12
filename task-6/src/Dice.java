import java.util.Random;

public class Dice {

    protected int value;
    protected Random random;

    public void setValue(int newValue) {

        this.value = newValue;
    }

    public int getValue() {

        return value;
    }

    public Dice() {

        Random random = new Random();

        setValue(random.nextInt(6) + 1);

    }

    public String toString() {

        String value = String.valueOf(getValue());

        return value;
    }

    public static void main(String[] args) {

    }
}