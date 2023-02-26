package com.illia.data.repository;

import com.illia.model.entity.BMWEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BMWRepository extends MongoRepository<BMWEntity, String> {



}
