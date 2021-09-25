package com.company.Book;

public class Book {

    private String author, title, yearOfwritten;
    private int pages;

    public Book(String author, String title, String yearOfwritten, int pages) {
        this.author = author;
        this.title = title;
        this.yearOfwritten = yearOfwritten;
        this.pages = pages;
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

    public String getYearOfwritten() {
        return yearOfwritten;
    }

    public void setYearOfwritten(String yearOfwritten) {
        this.yearOfwritten = yearOfwritten;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", yearOfwritten='" + yearOfwritten + '\'' +
                ", pages=" + pages +
                '}';
    }
}
