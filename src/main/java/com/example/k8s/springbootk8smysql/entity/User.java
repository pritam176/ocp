package com.example.k8s.springbootk8smysql.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "USER_DATA")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
 public class User {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
     private Long id;

     private String name;

     private String country;


 }
