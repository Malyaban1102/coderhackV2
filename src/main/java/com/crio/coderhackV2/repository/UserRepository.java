package com.crio.coderhackV2.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.crio.coderhackV2.entity.User;

public interface UserRepository extends MongoRepository<User,String>{
    
}
