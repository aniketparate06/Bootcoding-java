package com.composition;
public class BookApp {
    public static void main(String[] args) {
        Author author=new Author();
        author.setAge(24);
        author.setName("Aniket Parate");

        Publications publications=new Publications();
        publications.setName("Lalit Roshankhed");
        publications.setSince(1756);

        Book book=new Book();
        book.setTitle("Dreams Come True");
        book.setPublications(publications);
        book.setAuthor(author);


        System.out.println("Author Name: "+author.getName());
        System.out.println("Author Age: "+author.getAge());
        System.out.println("Publications Name: "+publications.getName());
        System.out.println("Since Publications: "+publications.getSince());
        System.out.println("Book Name: "+book.getTitle());

    }
}
