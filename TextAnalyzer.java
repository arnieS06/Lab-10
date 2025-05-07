public abstract class TextAnalyzer {
    private String text;
    protected double results;
    protected String reportPrefix;

    public TextAnalyzer() {

    }

    public TextAnalyzer(String t) {
        if (t.equals(null)) {
            throw new IllegalArgumentException("null was entered");
        }

        this.text = t;
    }

    public void analyze() {

    }

    public String report() {
        String resultsString = String.valueOf(results);
        return (this.reportPrefix + resultsString);
    }

    public String getText() {
        return this.text;
    }

    public double getResults() {
        return this.results;
    }

    public void setText(String t) {
        if (t.equals(null)) {
            throw new IllegalArgumentException("null was entered");
        }

        this.text = t;
    }



}
