package Model;

import java.sql.Date;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private String category;
    private Date year;
    private String publisher;
    private String path;
    private int pages;
    private String description;

    public Book(){};

    public Book(String isbn, String title, String author, String path, int pages) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.category = "N/A";
        this.year = Date.valueOf("2000-01-01");
        this.publisher = "N/A";
        this.path = path;
        this.pages = pages;
        this.description = "N/A";
    }

    public Book(String isbn, String title, String author, String category, Date year, String publisher, String path, int pages, String description) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.category = category;
        this.year = year;
        this.publisher = publisher;
        this.path = path;
        this.pages = pages;
        this.description = description;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", year=" + year +
                ", publisher='" + publisher + '\'' +
                ", path='" + path + '\'' +
                ", pages=" + pages +
                ", description='" + description + '\'' +
                '}';
    }
}
