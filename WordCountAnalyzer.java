import java.util.Scanner;

public class WordCountAnalyzer extends TextAnalyzer {

    public WordCountAnalyzer() {
        super();
        reportPrefix = "Word count: ";
    }

    public WordCountAnalyzer(String t) {
        super(t);
        reportPrefix = "Word count: ";
    }

    public void analyze() {
        Scanner s = new Scanner(getText());
        int wordCount = 0;

        while (s.hasNext()) { // assuming hasNext starts at the first token
            s.next();
            wordCount++;
        }
        results = wordCount;

    }

}
