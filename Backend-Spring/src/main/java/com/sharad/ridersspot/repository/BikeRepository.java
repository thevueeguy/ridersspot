package com.sharad.ridersspot.repository;

import com.sharad.ridersspot.collection.Bike;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BikeRepository extends MongoRepository<Bike,String> {
}
