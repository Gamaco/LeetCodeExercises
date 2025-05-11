import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestRunner {

    public static void runAllTest() {
        testListFilter();
        testWordCounter();
    }

    private static void testListFilter() {

        System.out.println("\nTesting List Filter...");

        List<Object> ee = new ArrayList<>(Arrays.asList(1, 2, "a", "b", 6, "x", 19));
        ListFilter LF = new ListFilter();

        System.out.println(LF.filterListByNumericValues(ee));
        System.out.println(LF.filterListByStringValues(ee));
    }

    private static void testWordCounter() {

        System.out.println("\nTesting Word Counter...");

        WordCounter wc = new WordCounter();

        String sentence = "In its beginnings, humanity emerged as a small, adaptive species shaped by the forces of nature and survival. Early humans lived in close-knit groups, relying on cooperation, communication, and rudimentary tools to hunt, gather, and protect themselves. Life was deeply intertwined with the environment, and survival depended on understanding the rhythms of nature—seasons, migrations, and weather. Over time, humans began to develop language, culture, and spirituality, forming the earliest expressions of art, community, and belief. These foundational traits laid the groundwork for agriculture, settlement, and the birth of civilization, marking the slow but profound transformation from nomadic life to structured societies.";

        System.out.println(wc.getWordCount(sentence));
    }
}
