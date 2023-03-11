package com.example.SpringbootRest.services;

import com.example.SpringbootRest.model.RestModel;
import com.example.SpringbootRest.repository.RestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RestService {

    @Autowired
    private RestRepository restRepository;
    public RestModel addBlMethod(RestModel restModel){
    return restRepository.save(restModel);
    }

    public Iterable<RestModel> findAll(){
        return restRepository.findAll();
    }

    public Optional<RestModel> findById(Integer id){
        return restRepository.findById(id);
    }

   public void delete(Integer id){
        restRepository.deleteById(id);
    }
}
