public class ProgrammingBook extends Book{
    String language;
    String frameWork;
    static int languageJavaCount = 0;
    public ProgrammingBook(int bookCode, String name, double price, String author, String language, String frameWork) {
        super(bookCode, name, price, author);
        this.language = language;
        this.frameWork = frameWork;
        if (this.getLanguage().equals("java")) {
            languageJavaCount++;
        }
    }
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getFrameWork() {
        return frameWork;
    }

    public void setFrameWork(String frameWork) {
        this.frameWork = frameWork;
    }

    @Override
    public double getPrice() {
        return (super.getPrice() * 95 / 100);
    }

}
