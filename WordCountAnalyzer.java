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
        //Hello world!
        for (int i = 0; i < getText().length(); i++) {
            if (s.hasNext()) {
                wordCount++;
            }
        }



    }

}
