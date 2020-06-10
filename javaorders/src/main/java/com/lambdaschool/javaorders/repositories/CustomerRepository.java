package com.lambdaschool.javaorders.repositories;

import com.lambdaschool.javaorders.models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

//    List<Customer> findCustomersByCustnameContainingIgnoringCase(String likename);
    ArrayList<Customer> findCustomersByCustnameContainingIgnoringCase(String likename);
}

