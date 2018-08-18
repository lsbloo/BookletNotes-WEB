package com.bookletnotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.bookletnotes.model.User;


@Repository
public interface UserRepository extends CrudRepository<User,Long>{

	
	User findByNome(Long id);
}
