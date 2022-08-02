package com.tcv.spring.myfirstapi.controllers;

import com.tcv.spring.myfirstapi.Model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    com.tcv.spring.myfirstapi.Service.CustomerService customerService;

    @GetMapping("/customers/all")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
}
