package com.appark.repo;
import org.springframework.data.jpa.repository.JpaRepository;

import com.appark.model.Suggestion;

public interface ISuggestionRepo extends JpaRepository<Suggestion,Integer>{

}
