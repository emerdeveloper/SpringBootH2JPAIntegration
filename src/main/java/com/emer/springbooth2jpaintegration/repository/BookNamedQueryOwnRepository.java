package com.emer.springbooth2jpaintegration.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.emer.springbooth2jpaintegration.model.Book;

/**
 * 
 * @author Emerson Javid Gonzalez Morales
 *
 *This is a example to use @NameQuery from Entity class (Book.java)
 */

public interface BookNamedQueryOwnRepository extends Repository<Book, Long>{
	// Query will be used from Named query defined at Entity class
	List<Book> findByPrice(long price);
}
