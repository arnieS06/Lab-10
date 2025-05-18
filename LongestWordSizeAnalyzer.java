import java.util.Scanner;

public class LongestWordSizeAnalyzer extends TextAnalyzer {
    public LongestWordSizeAnalyzer() {
        super();
        reportPrefix = "Longest word size: ";
    }

    public LongestWordSizeAnalyzer(String t) {
        super(t);
        reportPrefix = "Longest word size: ";
    }

    //  \\
    public void analyzer() {
        Scanner s = new Scanner(getText());
        int maxLength = 0;

        while (s.hasNext()) {
            String word = s.next();
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        results = maxLength;
    }
}
