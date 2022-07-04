package com.example.tusk.repository;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tusk.database.feedbackdb;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@ComponentScan("com.example")
@Repository
public interface feedbackRepo extends CrudRepository<feedbackdb,Integer> {
    //feedbackdb findRating(Integer rating);

}
