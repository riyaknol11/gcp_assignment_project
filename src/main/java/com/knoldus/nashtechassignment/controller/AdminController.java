package com.knoldus.nashtechassignment.controller;

import com.knoldus.nashtechassignment.model.KipKup;
import com.knoldus.nashtechassignment.service.impl.AdminServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

    @Autowired
    AdminServiceImpl adminService;

    @PostMapping("/addKipKupPlan")
    public KipKup createKipKupPlan(@RequestBody KipKup kipKup){
       return adminService.createPlan(kipKup);
    }

    @PutMapping("/updateKipKupPlan")
    public KipKup updateKipKupPlan(@RequestBody KipKup kipKup){
        return adminService.updatePlan(kipKup);
    }

}
