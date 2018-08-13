package com.ons.school.data.couchbase.repository;

import com.ons.school.data.couchbase.entity.UserEntity;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSBRepository extends CouchbaseRepository<UserEntity,String> {
}
