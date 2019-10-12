package com.way.mscclass.dao.repository;

import com.way.mscclass.dao.entity.Klass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface KlassRepository extends JpaRepository<Klass, Integer>, JpaSpecificationExecutor<Klass> {

}