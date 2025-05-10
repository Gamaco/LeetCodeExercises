import java.util.HashMap;
import java.util.Map;


public class Main {


    public static void main(String[] args) {

        String SENTENCE = "Most books reviewed on this site have been provided free of charge by the publisher, author or publicist. On occasion, we review books we have purchased with our own money or borrowed from a public library. Any links to places to purchase books are provided as a convenience, and do not serve as an endorsement by this blog. All reviews are the true and honest opinion of the blogger reviewing the book. The method of acquiring the book does not have a bearing on the content of the review.";

        WordCounter wc = new WordCounter();

        System.out.println(wc.getSingleWordCount(SENTENCE, "this"));
    }
}