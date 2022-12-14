package com.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Customers;

@Repository
public interface CustomerRepository extends JpaRepository<Customers, String> {

}
