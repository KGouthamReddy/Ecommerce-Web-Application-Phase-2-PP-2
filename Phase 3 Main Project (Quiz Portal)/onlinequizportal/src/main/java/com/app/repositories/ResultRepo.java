package com.app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.stereotype.Repository;

import com.app.entity.Result;


@Repository
public interface ResultRepo extends JpaRepository<Result, Integer> {
	
}
