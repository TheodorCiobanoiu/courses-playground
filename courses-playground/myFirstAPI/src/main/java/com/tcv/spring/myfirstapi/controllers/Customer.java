package com.tcv.spring.myfirstapi.controllers;

import org.springframework.stereotype.Controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    private Integer id;
}
