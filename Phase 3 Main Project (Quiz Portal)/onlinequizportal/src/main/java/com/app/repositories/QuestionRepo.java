package com.app.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;import org.springframework.stereotype.Repository;

import com.app.entity.Question;


@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {
	
	Optional<Question> findByQuesId(int quesId);

}