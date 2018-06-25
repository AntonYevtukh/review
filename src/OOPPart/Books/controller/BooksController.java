package OOPPart.Books.controller;

import OOPPart.Books.model.Book;

import java.util.Arrays;

public class BooksController {


    public Book[] getBooksByAuthor(Book[] books, String author){
        Book[] locBooks = Arrays.copyOf(books, books.length);
        int counter = 0;
        for (Book bk:
             books) {
            if(bk.getAuthor().equals(author))counter++;
        }
        Book[] res = new Book[counter];
        for (int i = 0, j = 0; i < locBooks.length; i++) {
            if(locBooks[i].getAuthor().equals(author)){
                res[j]=locBooks[i];
                j++;
            }
        }
        return res;
    }

    public Book[] getBooksByPublisher(Book[] books, String publisher){
        Book[] locBooks = Arrays.copyOf(books, books.length);
        int counter = 0;
        for (Book bk:
                books) {
            if(bk.getPublishedBy().equals(publisher))counter++;
        }
        Book[] res = new Book[counter];
        for (int i = 0, j = 0; i < locBooks.length; i++) {
            if(locBooks[i].getPublishedBy().equals(publisher)){
                res[j]=locBooks[i];
                j++;
            }
        }
        return res;
    }

    public Book[] getBooksAfterY(Book[] books, int year){
        Book[] locBooks = Arrays.copyOf(books, books.length);
        int counter = 0;
        for (Book bk:
                books) {
            if(bk.getYearOfPublishing() > year)counter++;
        }
        Book[] res = new Book[counter];
        for (int i = 0, j = 0; i < locBooks.length; i++) {
            if(locBooks[i].getYearOfPublishing() > year){
                res[j]=locBooks[i];
                j++;
            }
        }
        return res;
    }

    public Book[] sortByPublisher(Book[] books){
        Book[] locBooks = Arrays.copyOf(books, books.length);
        Arrays.sort(locBooks, Book.publicherComparator);
        return locBooks;
    }

    public void printBooks(Book[] books){
        for (Book bk:
             books) {
            System.out.println(bk);
        }
    }
}
