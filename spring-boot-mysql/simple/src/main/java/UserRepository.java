package com.eason;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.eason.User;


public interface UserRepository extends CrudRepository<User, Long> {

}