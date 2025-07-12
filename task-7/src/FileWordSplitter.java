import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class FileWordSplitter {

    private ArrayList<String> words = new ArrayList<>();

    public ArrayList<String> getWords() {

        return words;

    }

    public FileWordSplitter(String filename) {

        try {

            BufferedReader file = new BufferedReader(new FileReader(filename));

            String line = file.readLine();

            while (line != null) {

                String[] splitterStrings = line.split(" ");
                Collections.addAll(words, splitterStrings);
                line = file.readLine();

            }

            file.close();

        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());

            System.exit(1);
        }
    }

    public static void main(String[] args) {

        FileWordSplitter splitter = new FileWordSplitter(
                "C:/Users/Daniel/Documents/GitHub/parmhed-task-7/src/hamlet.txt");

        ArrayList<String> hamletWords = splitter.getWords();
        System.out.println(hamletWords.get(3));

    }

}
