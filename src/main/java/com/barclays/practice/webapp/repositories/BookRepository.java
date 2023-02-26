package com.barclays.practice.webapp.repositories;

import com.barclays.practice.webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
