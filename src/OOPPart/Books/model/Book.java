package OOPPart.Books.model;


import java.util.Comparator;

public class Book {

    private String name;
    private String author;
    private String publishedBy;
    private int yearOfPublishing;
    private int qPages; //pages было бы достаточно
    private long price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishedBy() {
        return publishedBy;
    }

    public void setPublishedBy(String publishedBy) {
        this.publishedBy = publishedBy;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public int getqPages() {
        return qPages;
    }

    public void setqPages(int qPages) {
        this.qPages = qPages;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public Book() {    }


    //Можно использовать this для вызова других конструкторов
    public Book(String name, String author, int qPages) {
        this.name = name;
        this.author = author;
        this.qPages = qPages;
        this.publishedBy = "none"; //можно было бы вынести в константу
        this.yearOfPublishing = -1;

    }

    public Book(String name, String author, String publishedBy, int yearOfPublishing, int qPages) {
        this.name = name;
        this.author = author;
        this.publishedBy = publishedBy;
        this.yearOfPublishing = yearOfPublishing;
        this.qPages = qPages;
        this.price = 0;
    }


    public Book(String name, String author, String publishedBy, int yearOfPublishing, int qPages, long price) {
        this.name = name;
        this.author = author;
        this.publishedBy = publishedBy;
        this.yearOfPublishing = yearOfPublishing;
        this.qPages = qPages;
        this.price = price;
    }

    @Override
    public String toString() {
        //тут можно без this
        //обычно он нужен в конструкторах и сеттерах
        String yearS;
        if(this.getYearOfPublishing() == -1){
            yearS = "unknown";
        }
        else {
            yearS = String.valueOf(this.getYearOfPublishing());
        }
        return "Book name: " + this.getName() + " has " + this.getqPages() + " pages"
                + ", created by " + this.getAuthor() + " and published by " + this.getPublishedBy() + " in " + yearS
                + ", costs " + this.getPrice();
    }

    //То же замечание, лучше сохранить в переменную и использовать геттер
    public static Comparator<Book> publicherComparator = new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getPublishedBy().compareTo(o2.getPublishedBy());
        }
    };
}
