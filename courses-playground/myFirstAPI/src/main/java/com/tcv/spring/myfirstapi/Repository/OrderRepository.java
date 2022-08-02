package com.tcv.spring.myfirstapi.Repository;

import com.tcv.spring.myfirstapi.Model.Orders;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderRepository extends CrudRepository<Orders,Integer> {
    public List<Orders> findAll();
}
