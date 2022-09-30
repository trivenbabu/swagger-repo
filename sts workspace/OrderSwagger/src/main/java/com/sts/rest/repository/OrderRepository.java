package com.sts.rest.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sts.rest.entity.Orders;

@Repository
public interface OrderRepository extends CrudRepository<Orders, Integer> 
{

}
