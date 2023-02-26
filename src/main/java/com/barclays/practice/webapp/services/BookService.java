package com.barclays.practice.webapp.services;

import com.barclays.practice.webapp.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
