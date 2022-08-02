package com.tcv.spring.myfirstapi.Model;

import com.sun.istack.NotNull;
import org.springframework.stereotype.Controller;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/* heeeeeeeeeeeeey */
@Entity
public class Customer {

    @Id
    @GeneratedValue
    private Integer id;
    @NotNull
    private String name;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
