package com.example.demo.test.dao;

import com.example.demo.test.domain.ManyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManyEntityDao extends JpaRepository<ManyEntity, Long> {
}



