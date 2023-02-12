import java.awt.print.Book;
import java.awt.print.Printable;

public class Main {
    public static void main(String[] args) {
        book bookOne = new book("Kapitanskaya dochka");
        book bookTwo = new book("Starik and sea");
        magazine magazineOne = new magazine("Stars");
        magazine magazineTwo = new magazine("Cool");

        printable [] prints = {bookOne, bookTwo, magazineOne, magazineTwo};
        for (printable printable : prints){
            printable.print();
        }
        magazine.printMagazines(prints);
        book.printBooks(prints);
    }
}