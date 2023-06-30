package com.knoldus.nashtechassignment.service;

import com.knoldus.nashtechassignment.model.Intern;

import java.util.List;

public interface InternService {
    List<Intern> fetchAllInterns();

    Intern addIntern(Intern intern);
    String deleteInternById(Long internId);

    Intern updateIntern(Intern intern);


}
