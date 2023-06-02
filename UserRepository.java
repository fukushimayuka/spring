package com.example.demo.user;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer>{

    @Query(value = "select * from users", nativeQuery = true)
    List<User> findAll();

    @Query(value = "select * from users where name = ?1", nativeQuery = true)
    User findByName(String name);

    @Modifying
    @Transactional
    @Query(value = "update users set name = 'xxx' where name = ?1", nativeQuery = true)
    void updateUser(String name);
}
