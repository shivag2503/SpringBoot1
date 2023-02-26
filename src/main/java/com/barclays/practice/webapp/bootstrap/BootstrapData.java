package com.barclays.practice.webapp.bootstrap;

import com.barclays.practice.webapp.domain.Author;
import com.barclays.practice.webapp.domain.Book;
import com.barclays.practice.webapp.domain.Publisher;
import com.barclays.practice.webapp.repositories.AuthorRepository;
import com.barclays.practice.webapp.repositories.BookRepository;
import com.barclays.practice.webapp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository,
                         PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author();
        eric.setFirstName("Eric");
        eric.setLastName("Evans");

        Book ddd = new Book();
        ddd.setTitle("Domain Driven Design");
        ddd.setIsbn("123456");

        Author ericSaved = authorRepository.save(eric);
        Book dddSaved = bookRepository.save(ddd);

        Author rod = new Author();
        rod.setFirstName("Rod");
        rod.setLastName("Johnson");

        Book noEJB = new Book();
        noEJB.setTitle("J2EE Development without EJB");
        noEJB.setIsbn("789456");


        Author rodSaved = authorRepository.save(rod);
        Book noEJBSaved = bookRepository.save(noEJB);

        ericSaved.getBooks().add(dddSaved);
        rodSaved.getBooks().add(noEJBSaved);
        dddSaved.getAuthors().add(ericSaved);
        noEJBSaved.getAuthors().add(rodSaved);

        Publisher pragmatic = new Publisher();
        pragmatic.setPublisherName("Pragmatic Programming");
        pragmatic.setAddress("25B Gems Street");
        pragmatic.setState("Rajasthan");
        pragmatic.setCity("Udaipur");
        pragmatic.setZip("313001");

        Publisher pragmaticSaved = publisherRepository.save(pragmatic);

        dddSaved.setPublisher(pragmaticSaved);
        noEJBSaved.setPublisher(pragmaticSaved);

        authorRepository.save(ericSaved);
        authorRepository.save(rodSaved);
        bookRepository.save(dddSaved);
        bookRepository.save(noEJBSaved);
    }
}
