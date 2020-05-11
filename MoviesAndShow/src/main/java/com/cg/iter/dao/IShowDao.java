package com.cg.iter.dao;

import java.util.List;

import com.movie.entities.Customer;
import com.movie.entities.Movie;
import com.movie.entities.Show;


public interface IShowDao {
	
	public List<Show> findActiveShows();

	public Movie findById(int i);

	public Customer getCustomer(int i);


}
