public class TextAnalysisSystem {
    private TextAnalyzer[] analyzers;
    private String currentText;

    public TextAnalysisSystem(String ct) {
        if (ct == null) {
            throw new IllegalArgumentException("null entry");
        }
        this.currentText = ct;
    }

    public void runAnalysis() {
        if (analyzers == null) {
            System.out.println("No analyzers to work with");
            return;
        }

        for (TextAnalyzer analyzer : analyzers) {
            analyzer.setText(currentText); // update analyzer's input
            analyzer.analyze();            // run analysis
            System.out.println(analyzer.report()); // print formatted report
        }
    }


    public TextAnalyzer[] getAnalyzers() {
        return analyzers;
    }

    public void setAnalyzers(TextAnalyzer[] analyzers) {
        this.analyzers = analyzers;
    }

    public String getCurrentText() {
        return currentText;
    }

    public void setCurrentText(String currentText) {
        if (currentText == null) {
            throw new IllegalArgumentException("cant enter null");
        }
        this.currentText = currentText;
    }


}
