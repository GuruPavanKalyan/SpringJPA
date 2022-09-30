package com.sopra.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sopra.rest.entity.Customer;

@Repository
public interface custRepository  extends CrudRepository<Customer, Integer>{

}
