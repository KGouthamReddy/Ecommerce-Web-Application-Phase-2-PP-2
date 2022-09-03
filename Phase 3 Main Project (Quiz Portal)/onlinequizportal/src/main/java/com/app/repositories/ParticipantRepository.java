package com.app.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.QuizParticipant;
@Repository
public interface ParticipantRepository extends CrudRepository<QuizParticipant, Integer>{
	//implement methods based on your requirements

}
