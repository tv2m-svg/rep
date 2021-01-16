package task.pkg61;

public class Book implements Comparable<Book> {
    private int id;
    private String author, title;

    public Book(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public Book() {
        this.id = -1;
        this.author = "Unknown";
        this.title = "";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", author=" + author + ", title=" + title + '}';
    }

    @Override
    public int compareTo(Book another) {
        if(author.equals(another.author))
            return title.compareTo(another.title);
        return author.compareTo(another.author);
    }
    
    
}
