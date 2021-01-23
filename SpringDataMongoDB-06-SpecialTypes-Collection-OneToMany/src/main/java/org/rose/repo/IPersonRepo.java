package org.rose.repo;

import org.rose.doc.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IPersonRepo extends MongoRepository<Person, Integer>{
	
}
