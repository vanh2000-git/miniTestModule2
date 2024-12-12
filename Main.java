public class Main {
    public static void main(String[] args) {

        ProgrammingBook programmingBook1 = new ProgrammingBook(001,"Sách pro1",50,"Dũng","java","c10");
        ProgrammingBook programmingBook2 = new ProgrammingBook(002,"Sách pro2",150,"Sơn","java","c10");
        ProgrammingBook programmingBook3 = new ProgrammingBook(003,"Sách pro3",70,"Quân","java1","c10");
        FictionBook fictionBook1 = new FictionBook(011, "Fictionbook1",101,"Dũng","Viễn tưởng 1");
        FictionBook fictionBook2 = new FictionBook(012, "Fictionbook2",92,"Dũng","Viễn tưởng 1");
        FictionBook fictionBook3 = new FictionBook(013, "Fictionbook3",300,"Sơn","Viễn tưởng 2");

        double []bookArray = new double[6];
        bookArray[0] = programmingBook1.getPrice();
        bookArray[1] = programmingBook2.getPrice();
        bookArray[2] = programmingBook3.getPrice();
        bookArray[3] = fictionBook1.getPrice();
        bookArray[4] = fictionBook2.getPrice();
        bookArray[5] = fictionBook3.getPrice();

        double sum = 0;
        for (int i = 0; i < bookArray.length; i++) {
            sum += bookArray[i];
        }
        System.out.println("Tổng tiền: " + sum);
        System.out.println("Số sách programming có language là java:" + ProgrammingBook.languageJavaCount);
        System.out.println("Số sách Fiction có Category là Viễn tưởng 1:" + FictionBook.categoryCount);
        System.out.println("Số sách Fiction có giá thấp hơn 100:" + FictionBook.under100Count);
    }

}
