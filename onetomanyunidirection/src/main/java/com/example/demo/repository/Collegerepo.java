package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.College;

public interface Collegerepo extends JpaRepository<College, Integer> {

}
