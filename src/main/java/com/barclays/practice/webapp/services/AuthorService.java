package com.barclays.practice.webapp.services;

import com.barclays.practice.webapp.domain.Author;

public interface AuthorService {

    Iterable<Author> findAll();
}
