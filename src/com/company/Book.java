package com.company;

public class Book {
    private Author author=new Author();
    String title;
    BookType type;
    double price;
    int available;
    public Book() {
        this.author =new Author();
        this.title="";
        this.type = BookType.BOOK;
        this.price=0;
        this.available=0;
    }

    public Book(Author author, String title, BookType type, double price, int available) {
        this.author = author;
        this.title = title;
        this.type = type;
        this.price = price;
        this.available = available;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
