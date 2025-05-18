import java.util.Scanner;

public class WordSizeAnalyzer extends TextAnalyzer {
    public WordSizeAnalyzer() {
        super();
        reportPrefix = "Average word size: ";
    }

    public WordSizeAnalyzer(String t) {
        super(t);
        reportPrefix = "Average word size: ";
    }

    public void analyze() {
        int totalCharCount = 0;
        Scanner s = new Scanner(getText());

        for (int i = 0; i < getText().length(); i++) {
            if (!Character.isWhitespace(getText().charAt(i))) {
                totalCharCount++;
            }
        }

        // calculating word count
        int wordCount = 0;

        while (s.hasNext()) { 
            s.next();
            wordCount++;
        }

        results = totalCharCount/wordCount;

    }
}
