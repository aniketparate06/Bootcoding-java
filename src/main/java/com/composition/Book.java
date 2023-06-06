package com.composition;

public class Book {
    private String title;
    private Author author;
    private Publications publications;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publications getPublications() {
        return publications;
    }

    public void setPublications(Publications publications) {
        this.publications = publications;
    }
}