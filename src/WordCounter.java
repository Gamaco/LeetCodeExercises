import java.util.HashMap;
import java.util.Map;

import static java.lang.String.format;

public class WordCounter {

    public WordCounter() {

    }

    public String getSingleWordCount(String p_sentence, String p_word) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : p_sentence.split(" ")) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return (String)(format("The word `%s` appears `%s` times in the sentence provided.", p_word, wordCount.getOrDefault(p_word,0)));
    }

    public Map<String, Integer> getWordCount(String p_sentence) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : p_sentence.split(" ")) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount;
    }
}
