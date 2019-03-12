package com.kodilla.patterns.singleton;

import com.kodilla.patterns.prototype.library.Book;
import com.kodilla.patterns.prototype.library.Library;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //given
        //creating data for original object library:
        Library library = new Library("library1");
        Book book = new Book("sdgvz","zsrg",LocalDate.of(2005,10,10));
        Book book1 = new Book("sdgvz","zsrg",LocalDate.of(2005,10,10));
        Book book2 = new Book("sdgvz","zsrg",LocalDate.of(2005,10,10));
        Book book3 = new Book("sdgvz","zsrg",LocalDate.of(2005,10,10));
        library.getBooks().add(book);
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);

        //using shallow copying for cloning library:
        Library clonedLibrary1 = null;
        try {
            clonedLibrary1 = library.shallowCopy();
            clonedLibrary1.setName("cloned 1");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //using deep coping for cloning library
        Library clonedLibrary2 = null;
        try{
            clonedLibrary2 = library.deepCopy();
            clonedLibrary2.setName("cloned 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        library.getBooks().remove(book);

        System.out.println(library);
        System.out.println(clonedLibrary1);
        System.out.println(clonedLibrary2);
        //then
        Assert.assertEquals(3,library.getBooks().size());
        Assert.assertEquals(3,clonedLibrary1.getBooks().size());
        Assert.assertEquals(4,clonedLibrary2.getBooks().size());
        Assert.assertEquals(library.getBooks(),clonedLibrary1.getBooks());
        Assert.assertNotEquals(library.getBooks(),clonedLibrary2.getBooks());

    }
}
