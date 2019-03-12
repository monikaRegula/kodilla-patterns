package com.kodilla.patterns.prototype.library;


import java.util.HashSet;
import java.util.Set;

public final class Library extends Protorype{
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Library shallowCopy() throws CloneNotSupportedException{
       return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException{
    Library clonedLibrary = (Library)super.clone();
    clonedLibrary.books = new HashSet<>();
    for (Book book : books){
        Book clonedBook = new Book(book.title,book.title,book.publicationDate);
        clonedLibrary.getBooks().add(clonedBook);
    }
    return clonedLibrary;
    }

    @Override
    public String toString(){
        return "\nLibrary = "+this.name +
                " Books: "+this.getBooks().toString();
    }
}
