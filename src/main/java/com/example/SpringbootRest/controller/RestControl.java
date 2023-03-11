package com.example.SpringbootRest.controller;

import com.example.SpringbootRest.model.RestModel;
import com.example.SpringbootRest.services.RestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api")
public class RestControl {

    @Autowired
    private RestService restService;

    @PostMapping("/add")
    public RestModel addOrUpdateRecord(@RequestBody RestModel restModel){

        return restService.addBlMethod(restModel);
    }

    @GetMapping("/all")
    public Iterable<RestModel> findAllRecord(){
        return restService.findAll();
    }

    @GetMapping("/find/{id}")
    public Optional<RestModel> findById(@PathVariable Integer id){

        return restService.findById(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> removeById(@PathVariable Integer id){
       restService.delete(id);
        return new ResponseEntity<String>("Deleted", HttpStatus.OK);
    }
}
