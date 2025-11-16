package com.example.messima4.Q1;

public class Book extends Product {
    private int pages;

    public Book(String name, double price, String description, int pages) {
        super(name, price, description);
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Number of pages is: " + pages;
    }
}
