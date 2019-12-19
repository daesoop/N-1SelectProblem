package com.example.demo.test.dao;

import com.example.demo.test.domain.ManyEntity;
import com.example.demo.test.domain.OneEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OneEntityDao extends JpaRepository<OneEntity, Long> {

//    @EntityGraph(attributePaths = "manyEntities")
//    @Query("select a from OneEntity a")
//    List<OneEntity> findAllManyEntities();

}
