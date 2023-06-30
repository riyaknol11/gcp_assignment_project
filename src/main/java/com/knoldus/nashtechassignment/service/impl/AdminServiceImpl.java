package com.knoldus.nashtechassignment.service.impl;

import com.knoldus.nashtechassignment.dao.KipKupRepository;
import com.knoldus.nashtechassignment.model.KipKup;
import com.knoldus.nashtechassignment.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private KipKupRepository kipKupRepository;

    private KipKup kipKup;
    @Override
    public KipKup createPlan(KipKup kipKupPlan) {
        return kipKupRepository.save(kipKupPlan);
    }

    @Override
    public KipKup updatePlan(KipKup kipKupPlan) {
        if(kipKupRepository.findById(kipKupPlan.getSessionId()).isPresent())
            return kipKupRepository.save(kipKupPlan);
        else
            return null;
    }
}