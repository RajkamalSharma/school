package com.ons.school.data.mysql.repository;

import com.ons.school.data.mysql.entity.TeacherEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface TeacherRepository extends JpaRepository<TeacherEntity,Integer> {
}
