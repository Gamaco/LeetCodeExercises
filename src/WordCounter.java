import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;

public class WordCounter {

    public WordCounter() {}

    /**
     * Counts the amount of occurrences of a specific word in a given string.
     * @param p_sentence string used for parsing words.
     * @param p_word word being used for counting occurrences in the string.
     * @return String with the desired word and the amount of occurrences of the word.
     */
    public String getSingleWordCount(String p_sentence, String p_word) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : p_sentence.split(" ")) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return (String)(format("The word `%s` appears `%s` times in the sentence provided.", p_word, wordCount.getOrDefault(p_word,0)));
    }

    /**
     * Parses a given string, loops through all the words counting the
     * amount of reoccurrences in the sentence provided.
     * @param p_sentence sentence used to count words.
     * @return returns a map of words with their respective count.
     */
    public Map<String, Integer> getWordCount(String p_sentence) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : p_sentence.split(" ")) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount;
    }
}
