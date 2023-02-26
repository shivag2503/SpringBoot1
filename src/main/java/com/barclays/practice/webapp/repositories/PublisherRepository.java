package com.barclays.practice.webapp.repositories;

import com.barclays.practice.webapp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
