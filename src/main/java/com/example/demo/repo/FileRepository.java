package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.demoModel.FileEntity;

public interface FileRepository extends JpaRepository<FileEntity, Long> {

}
