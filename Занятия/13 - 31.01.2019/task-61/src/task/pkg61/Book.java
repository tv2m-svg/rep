package task.pkg61;

public class Book implements Comparable<Book> {
    private static int number;
    private int id;
    private String author, title;

    public Book(int id, String author, String title) {
        this.id = id;
        this.author = author;
        this.title = title;
    }

    public Book(String author, String title) {
        this.id = ++number;
        this.author = author;
        this.title = title;
    }
    

    public Book() {
        this.id = ++number;
        this.author = "Unknown";
        this.title = "Unknown";
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
}
