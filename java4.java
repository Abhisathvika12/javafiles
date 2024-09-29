public class Book {
    private String name;
    private String isbn;
    private String author;
    private String publisher;
    public Book(String name, String isbn, String author, String publisher) {
        this.name = name;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setAuthor(String author) {
        this.author = author;
}
 public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getAuthor() {
        return author;
    }

 public String getPublisher() {
        return publisher;
    }

    public static void main(String[] args) {
        Book book = new Book("To Kill a Mockingbird", "9780061120084", "Harper Lee", "J.B. Lippincott & Co.");
        System.out.println("Book Name: " + book.getName());
        System.out.println("ISBN: " + book.getIsbn());
        System.out.println("Author: " + book.getAuthor());
        System.out.println("Publisher: " + book.getPublisher());
    }
}