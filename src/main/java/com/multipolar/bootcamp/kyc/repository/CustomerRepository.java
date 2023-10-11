package com.multipolar.bootcamp.kyc.repository;

import com.multipolar.bootcamp.kyc.domain.Customer;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CustomerRepository extends MongoRepository<Customer, String> {
    Optional<Customer> findByNik(String nik);

    @Query("{ 'firstName' : { $regex: ?0, $options: 'i' } }")
    Optional<Customer> findByFirstNameCaseInsensitive(String firstName);
}
