package com.knoldus.nashtechassignment.service.impl;

import com.knoldus.nashtechassignment.dao.InternRepository;
import com.knoldus.nashtechassignment.model.Intern;
import com.knoldus.nashtechassignment.service.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternServiceImpl implements InternService {

    @Autowired
    private InternRepository internRepository;


    @Override
    public List<Intern> fetchAllInterns() {
        return internRepository.findAll();
    }

    @Override
    public Intern addIntern(Intern intern) {
        return internRepository.save(intern);
    }

    @Override
    public String deleteInternById(Long id) {
        if(internRepository.findById(id).isPresent()) {
            internRepository.deleteById(id);
            return "intern id " + id + " successfully";
        }
        else
            return "intern not found!";
    }

    @Override
    public Intern updateIntern(Intern intern) {
        if(internRepository.findById(intern.getIntern_id()).isPresent())
            return internRepository.save(intern);
        else
            return null;
    }


}