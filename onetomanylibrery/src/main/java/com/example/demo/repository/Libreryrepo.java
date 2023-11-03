package com.example.demo.repository;

import org.apache.tomcat.jni.Library;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Librery;

public interface Libreryrepo extends JpaRepository<Librery, Integer> {

}
