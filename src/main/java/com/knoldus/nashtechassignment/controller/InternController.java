package com.knoldus.nashtechassignment.controller;

import com.knoldus.nashtechassignment.model.Intern;
import com.knoldus.nashtechassignment.service.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class InternController {

    @Autowired
    private InternService internService;

    @GetMapping("/getInterns")
    public ResponseEntity<List<Intern>> getIntern(){
        return ResponseEntity.ok(internService.fetchAllInterns());
    }

    @PostMapping("/addIntern")
    public ResponseEntity<Intern> addIntern(@RequestBody Intern intern){
        return ResponseEntity.ok(internService.addIntern(intern));
    }

    @DeleteMapping("deleteIntern/{id}")
    public String deleteInternById(@PathVariable Long id){
        return internService.deleteInternById(id);
    }

    @PutMapping("/updateIntern")
    public Intern updateInternById(@RequestBody Intern intern){
        return internService.updateIntern(intern);
    }


}
