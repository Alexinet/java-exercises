package com.company;

public class Book {

    private String author, tome, title;
    private int pages;

    public Book(String author, String tome, String title, int pages) {
        this.author = author;
        this.tome = tome;
        this.title = title;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTome() {
        return tome;
    }

    public void setTome(String tome) {
        this.tome = tome;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public static void getBookInformation(String title, String author, String tome, int pages) {
        System.out.println("Book title: " + title);
        System.out.println("Written by " + author);
        System.out.println(pages + " pages in " + tome + " tome(s)");
    }
}
