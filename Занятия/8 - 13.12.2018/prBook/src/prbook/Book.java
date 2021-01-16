
package prbook;


public class Book implements Comparable<Book>{
    
    private int id;
    private String name, author, publisher;
    private int year;

    public Book(int id, String name, String author, String publisher, int year) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", name=" + name + ", author=" + author + ", publisher=" + publisher + ", year=" + year + '}';
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    @Override
    public int hashCode() {
        int hash = 7;
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

    @Override
    public int compareTo(Book t) {
        //return id - t.id;
        //author - по алфавиту, год - по убыванию
        if (author.equals(t.author)){
            return -(year-t.year);
        }
        return author.compareTo(t.author);
    }
    
    

    
}
