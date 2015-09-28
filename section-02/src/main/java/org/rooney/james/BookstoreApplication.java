package org.rooney.james;

import org.rooney.james.domain.Book;
import org.rooney.james.domain.Chapter;
import org.rooney.james.domain.Publisher;
import org.rooney.james.service.BookStoreService;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

//@SpringBootApplication
public class BookstoreApplication {

    public static void main(String[] args) {
//        SpringApplication.run(BookstoreApplication.class, args);

        BookStoreService bookStoreService = new BookStoreService();

        //persisting object graph
        Publisher publisher = new Publisher("MANN", "Manning Publications Co.");

        Book book = new Book("9781617290459", "Java Persistence with Hibernate, Second Edition", publisher);

        List<Chapter> chapters = new ArrayList<Chapter>();
        Chapter chapter1 = new Chapter("Introducing JPA and Hibernate", 1);
        chapters.add(chapter1);
        Chapter chapter2 = new Chapter("Domain Models and Metadata", 2);
        chapters.add(chapter2);

        book.setChapters(chapters);

        bookStoreService.persistObjectGraph(book);

        //retrieving object graph
        /*
        Book book = bookStoreService.retrieveObjectGraph("9781617290459");
        System.out.println(book);
        */
    }
}
