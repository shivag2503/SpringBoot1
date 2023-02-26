package com.barclays.practice.webapp.repositories;

import com.barclays.practice.webapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
