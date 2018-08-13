package com.ons.school.data.couchbase.repository;

import com.ons.school.data.couchbase.entity.CustomerEntity;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerSBRepository extends CouchbaseRepository<CustomerEntity , String> {
}
