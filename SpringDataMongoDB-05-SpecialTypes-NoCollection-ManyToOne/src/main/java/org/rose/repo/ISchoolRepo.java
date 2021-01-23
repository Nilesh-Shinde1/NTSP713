package org.rose.repo;

import org.rose.doc.School;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ISchoolRepo extends MongoRepository<School, String>{

}
