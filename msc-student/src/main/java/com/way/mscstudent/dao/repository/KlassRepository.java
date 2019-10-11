package com.way.mscstudent.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.way.mscstudent.dao.entity.Klass;
import org.springframework.stereotype.Repository;

@Repository
public interface KlassRepository extends JpaRepository<Klass, Integer>, JpaSpecificationExecutor<Klass> {

}