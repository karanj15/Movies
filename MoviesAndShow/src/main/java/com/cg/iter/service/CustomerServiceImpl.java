package com.cg.iter.service;


import org.springframework.stereotype.Service;

import com.movie.entities.Customer;

@Service
public interface CustomerServiceImpl {


	public Customer getCustomer(Integer id);
	
	
}
