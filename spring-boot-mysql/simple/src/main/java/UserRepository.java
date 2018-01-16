package com.eason;


import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.eason.User;


public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findByName(String name);

    @Query("select id,name,num from User where name='yyyy'")
    List<User> findUserByXXX();

    @Query("select u from User u where u.name like %:name%")
    List<User> findUserByCus(@Param("name") String username);

    @Query(value = "select * from user",  nativeQuery=true)
    List<User> findUserByNativeQuery();

}