package com.example.SpringbootRest.repository;

import com.example.SpringbootRest.model.RestModel;
import org.springframework.data.repository.CrudRepository;

public interface RestRepository extends CrudRepository<RestModel, Integer> {

}
