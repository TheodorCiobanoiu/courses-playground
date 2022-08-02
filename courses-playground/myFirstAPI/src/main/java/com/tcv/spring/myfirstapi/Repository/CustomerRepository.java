package com.tcv.spring.myfirstapi.Repository;

import com.tcv.spring.myfirstapi.Model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.ResultSet;

public interface CustomerRepository extends CrudRepository<Customer,Integer> {

    public Customer getById(String customerId);


}
