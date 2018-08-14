package com.ons.school.data.mysql.repository;

import com.ons.school.data.mysql.entity.SubjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends JpaRepository<SubjectEntity,Integer> {
}
