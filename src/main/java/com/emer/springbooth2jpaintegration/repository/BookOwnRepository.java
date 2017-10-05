package com.emer.springbooth2jpaintegration.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import com.emer.springbooth2jpaintegration.model.Book;

import java.util.List;

/**
 * 
 * @author Emerson Javid Gonzalez Morales
 * 
 * Query Methods
 *
 *Using query methods are most convenient way to write our own queries to fetch data from the database.
 *Spring data jpa allows more powerful query formation using the methods names and parameter.
 */

public interface BookOwnRepository extends Repository<Book, Long>{
	@Query(value = "select author from Book b where b.author = ?1")
	List<Book> findByName(String name);
	List<Book> findByNameAndAuthor(String name, String author);
}
