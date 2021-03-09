package org.rose.repo;

import org.rose.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepo extends CrudRepository<User, String>{
	
	@Query("SELECT COUNT(*) FROM User WHERE username=:un AND password=:pwd")
	int checkCredentials(@Param("un")String username, @Param("pwd")String password);
}
