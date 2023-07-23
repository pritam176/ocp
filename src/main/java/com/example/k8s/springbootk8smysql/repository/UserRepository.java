package com.example.k8s.springbootk8smysql.repository;

import com.example.k8s.springbootk8smysql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}