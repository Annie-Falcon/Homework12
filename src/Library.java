public class Library {

    public static void useLibrary() {
        Author authorOG = new Author("Ольга", "Громыко");
        Author authorSR = new Author("Софья", "Ролдугина");
        Book bookRY = new Book("Год крысы", 2025, authorOG);
        Book bookKD = new Book("Ключ от всех дверей", 2018, authorSR);

        System.out.println("Книги библиотеки:");
        bookRY.printBook();
        bookKD.printBook();

        bookKD.setPublisherYear(2020);
        System.out.println(" ");
        System.out.println("Изменения в данных библиотеки:");
        bookKD.printBook();
    }
}
