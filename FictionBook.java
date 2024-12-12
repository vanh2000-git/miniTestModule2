public class FictionBook extends Book {
    String category;
    static int categoryCount = 0;
    static int under100Count = 0;
    public FictionBook(int bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
        if (this.getCategory().equals("Viễn tưởng 1")){
            categoryCount++;
        }
        if (this.getPrice()<100){
            under100Count++;
        }
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public double getPrice() {
        return (super.getPrice() * 93 / 100);
    }
}
