package org.rose.repository;

import org.rose.document.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepo extends MongoRepository<Customer, String> {

}
