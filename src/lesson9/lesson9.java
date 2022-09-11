package lesson9;

/*1) With the help of HashMap try to calculate all of the unique words in the song Umbrella ignoring the case.
        Print all of these words to the console with the number of times they appear in the text.
        Find the most frequent word in the text and print it to the console as well.*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class lesson9 {
    static List<String> readSongFile() {
        File file = new File("song.txt");
        List<String> result = new ArrayList<>();
        try (Scanner reader = new Scanner(file)) {
            while (reader.hasNextLine()) {
                result.add(reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File with song not found");
        }
        return result;
    }

    static List<String> breakIntoWords(List<String> lines) {
        List<String> wordsResult = new ArrayList<>();
        for (String line : lines) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                String cleanWord = word.replaceAll("[^a-zA-Z0-9']", "");
                if (!cleanWord.isEmpty()) wordsResult.add(cleanWord.toLowerCase());
            }
        }
        return wordsResult;
    }

    static Map<String, Integer> countWords(List<String> words) {
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String word : words) {
            wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);
        }
        return wordsCount;
    }

    static void getMostFrequent(Map<String, Integer> wordsCount) {
        Integer maxCount = 0;
        String resultWord = null;

        Set<String> words = wordsCount.keySet();
        for (String word : words) {
            Integer count = wordsCount.get(word);
            if (count > maxCount) {
                maxCount = count;
                resultWord = word;
            }
        }
        System.out.printf("Most frequent word: %s - %d\n", resultWord, maxCount);
    }

    public static void main(String[] args) {
        List<String> lines = readSongFile();
        List<String> words = breakIntoWords(lines);
        Map<String, Integer> wordsCount = countWords(words);
        System.out.printf("All words count: %s\n", wordsCount);
        getMostFrequent(wordsCount);
    }
}
