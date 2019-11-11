package com.lobach;

import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public String getAuthorsToString() {
        StringBuilder builder = new StringBuilder();
        for(Author s : authors) {
            builder.append(s.toString()+", ");
        }
        String str = builder.toString();
        return str;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Book[" +
                "name='" + name + '\'' +
                ", authors=" + getAuthorsToString() +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getAuthorsNames() {

        StringBuilder builder = new StringBuilder();
        for(Author s : authors) {
            builder.append(s.getName()+", ");
        }
        String str = builder.toString();
        return str;


    }

}

