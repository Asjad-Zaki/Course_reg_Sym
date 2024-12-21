package com.example.Course.Registration.System.repository;

import com.example.Course.Registration.System.model.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRegistryRepo extends JpaRepository<CourseRegistry,Integer> {
}
