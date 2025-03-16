package com.shruti.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shruti.entity.ProductE;

public interface ProductRepository extends JpaRepository<ProductE, Integer> {

}
