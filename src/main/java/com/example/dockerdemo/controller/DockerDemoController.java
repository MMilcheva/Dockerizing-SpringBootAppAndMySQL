package com.example.dockerdemo.controller;



import com.example.dockerdemo.entity.DemoEntity;
import com.example.dockerdemo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/docker")
public class DockerDemoController {

@Autowired
DemoRepository demoRepository;

    @GetMapping("testAPI")
    public String testMethod() {
        return "I am the new docker-demo and I working perfectly fine!";
    }

    @PostMapping(path = "/add")
    public ResponseEntity<DemoEntity> add(@RequestBody DemoEntity entity) {

        DemoEntity resultEntity = demoRepository.save(entity);
        return new ResponseEntity<>(resultEntity, HttpStatus.OK);
    }

    @GetMapping(path = "/all")
    public ResponseEntity<List<DemoEntity>> getAll() {

        List<DemoEntity> demoEntityList = demoRepository.findAll();

        return new ResponseEntity<>(demoEntityList, HttpStatus.OK);
    }
}
