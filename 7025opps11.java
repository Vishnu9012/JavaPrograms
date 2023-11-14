import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added to the library: " + book);
    }

    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println("Book removed from the library: " + book);
        } else {
            System.out.println("Book not found in the library: " + book);
        }
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}

 class LibraryApp {
    public static void main(String[] args) {
        Library library = new Library();

        
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        library.addBook(book1);
        library.addBook(book2);
        library.displayBooks();

        // Removing a book from the library
        library.removeBook(book1);
        library.displayBooks();
    }
}

