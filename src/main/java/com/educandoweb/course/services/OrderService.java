package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repossitory;
	
	public List<Order> findAll(){
		return repossitory.findAll();
	}
	
	public Order findById(Long id) {
		Optional<Order> obj = repossitory.findById(id);
		return obj.get();
	}
}
