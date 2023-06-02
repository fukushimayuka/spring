package com.example.demo.div;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DivRepository extends JpaRepository<Div, Integer>{

    @Query(value = "select * from divs", nativeQuery = true)
    List<Div> findAll();
    
}
