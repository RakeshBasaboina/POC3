package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;

@Repository
public interface PersonDaoo extends MongoRepository<Person,Integer> {

}
