package com.tcv.spring.myfirstapi.Model;

import com.sun.istack.NotNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {

    @Id
    @GeneratedValue
    private Integer id;
    @NotNull
    private String name;
    private Double price;
}
