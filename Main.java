public class Main {
    public static void main(String[] args) {

        ProgrammingBook programmingBook1 = new ProgrammingBook(001, "Sách pro1", 50, "Dũng", "java", "c10");
        ProgrammingBook programmingBook2 = new ProgrammingBook(002, "Sách pro2", 150, "Sơn", "java", "c10");
        ProgrammingBook programmingBook3 = new ProgrammingBook(003, "Sách pro3", 70, "Quân", "java1", "c10");
        FictionBook fictionBook1 = new FictionBook(011, "Fictionbook1", 101, "Dũng", "Viễn tưởng 1");
        FictionBook fictionBook2 = new FictionBook(012, "Fictionbook2", 92, "Dũng", "Viễn tưởng 1");
        FictionBook fictionBook3 = new FictionBook(013, "Fictionbook3", 300, "Sơn", "Viễn tưởng 2");

        Book[] bookArray = {fictionBook1, fictionBook2, fictionBook3, programmingBook1, programmingBook2, programmingBook3};
        double sum = 0;
        int countFictionCategory = 0;
        int under100Count = 0;
        int countJavaLang = 0;
        for (Book book : bookArray) {
            sum += book.getPrice();
            if (book instanceof FictionBook) {
                if (((FictionBook) book).getCategory().equals("Viễn tưởng 1") && book.getPrice() < 100) {
                    countFictionCategory++;
                    under100Count++;
                } else if (((FictionBook) book).getCategory().equals("Viễn tưởng 1")) {
                    countFictionCategory++;
                } else if (book.getPrice() < 100) {
                    countFictionCategory++;
                }
            } else if (book instanceof ProgrammingBook) {
                if (((ProgrammingBook) book).getLanguage().equals("java")) {
                    countJavaLang++;
                     
                }
            }
        }
        System.out.println("Tổng tiền: " + sum);
        System.out.println("Số sách programming có language là java:" + countJavaLang);
        System.out.println("Số sách Fiction có Category là Viễn tưởng 1:" + countFictionCategory);
        System.out.println("Số sách Fiction có giá thấp hơn 100:" + under100Count);
    }


}


