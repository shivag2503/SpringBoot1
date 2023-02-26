package com.barclays.practice.webapp.services;

import com.barclays.practice.webapp.domain.Book;
import com.barclays.practice.webapp.repositories.BookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    
    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}
