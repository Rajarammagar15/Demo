package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.demoModel.DemoModel;

@Repository
public interface DemoRepository extends JpaRepository<DemoModel, Long> {

}
