import java.util.ArrayList;
import java.util.HashMap;

public class FileTextAnalyzer {

    private FileWordSplitter words;
    HashMap<String, Integer> wordOccurrences = new HashMap<>();

    public FileTextAnalyzer(String filename) {

        words = new FileWordSplitter(filename);

        ArrayList<String> wordList = words.getWords();

        for (String word : wordList) {

            word = word.toLowerCase();

            if (wordOccurrences.containsKey(word)) {

                int oldValue = wordOccurrences.get(word);
                wordOccurrences.put(word, oldValue + 1);

            } else {

                wordOccurrences.put(word, 1);
            }

        }

    }

    public int wordCount() {

        int wordCount = 0;

        ArrayList<String> wordAnalyzer = words.getWords();
        wordCount = wordAnalyzer.size();

        System.out.println(wordCount);

        return wordCount;
    }

    public int occurrencesOf(String word) {

        int occurencesOf = 0;

        if (wordOccurrences.containsKey(word)) {

            occurencesOf += wordOccurrences.get(word);

        }

        System.out.println(occurencesOf);

        return occurencesOf;
    }

    public double frequencyOf(String word) {

        double frequencyOf = 0;

        if (wordOccurrences.containsKey(word)) {

            frequencyOf = (double) wordOccurrences.get(word) / (double) wordCount();

        }

        System.out.println(frequencyOf);

        return frequencyOf;
    }

    public int uniqueWordCount() {

        int uniqueWordCount = wordOccurrences.size();

        System.out.println(uniqueWordCount);

        return uniqueWordCount;
    }

    public static void main(String[] args) {

        FileTextAnalyzer analyzer = new FileTextAnalyzer(
                "C:/Users/Daniel/Documents/GitHub/parmhed-task-7/src/hamlet.txt");

        analyzer.occurrencesOf("hamlet");

        analyzer.frequencyOf("hamlet");
        analyzer.uniqueWordCount();

    }

}
