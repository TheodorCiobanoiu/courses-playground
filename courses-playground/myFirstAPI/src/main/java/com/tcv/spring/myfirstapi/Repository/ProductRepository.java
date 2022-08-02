package com.tcv.spring.myfirstapi.Repository;

import com.tcv.spring.myfirstapi.Model.Product;
import org.springframework.data.repository.CrudRepository;

interface ProductRepository extends CrudRepository<Product,Integer> {
    public void delete(Product product);
}
