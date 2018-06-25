package OOPPart.Books.view;

import OOPPart.Books.controller.BooksController;
import OOPPart.Books.model.Book;

public class Main {

    public static void main(String[] args) {


        Book bk1 = new Book("Witcher", "Sapkovsky", "Pol group", 2010, 350, 220);
        Book bk2 = new Book("Big Getsby", "Some Author", "Book Global", 1998, 220, 220);
        Book bk3 = new Book("Master and margarita", "Second Author", "Creator group", 1977, 210, 220);
        Book bk4 = new Book("Run Forest", "Medovarov", "American poli", 1980, 732, 463);
        Book bk5 = new Book("Eneyida", "Vergily", "Some word", 1874, 370, 846);
        Book bk6 = new Book("Dead souls", "Gogol", "Interesting read", 1864, 753, 123);
        Book bk7 = new Book("Hobbit", "Tolkien", "Eurobook", 2002, 798, 456);
        Book bk8 = new Book("Lord of the rings", "Tolkien", "Eurobook", 2000, 247, 745);
        Book bk9 = new Book("American gods", "Medovarov", "Random", 2015, 956, 354);
        Book bk10 = new Book( "Jakonda", "Davinchi", "Hands", 1600, 299, 9563);

        Book[] testBooks = {bk1, bk2, bk3, bk4, bk5, bk6, bk7, bk8, bk9, bk10};

        BooksController bCon = new BooksController();

        System.out.println("--------");

        bCon.printBooks(testBooks);
        System.out.println("--------");

        bCon.printBooks(bCon.getBooksAfterY(testBooks, 2000));
        System.out.println("--------");
        bCon.printBooks(bCon.getBooksByAuthor(testBooks, "Medovarov"));
        System.out.println("--------");
        bCon.printBooks(bCon.getBooksByPublisher(testBooks, "Eurobook"));
        System.out.println("--------");
        bCon.printBooks(bCon.sortByPublisher(testBooks));



    }
}
