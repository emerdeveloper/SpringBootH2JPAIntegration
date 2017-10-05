package com.emer.springbooth2jpaintegration.repository;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;

import com.emer.springbooth2jpaintegration.model.Book;

/**
 * 
 * @author Emerson Javid Gonzalez Morales
 * 
 * This is a service layer that will be between REST API and Spring Data Repository
 *
 * Isn't a good practice to directly invoke the data access APIs from our REST
 *
 */

public interface BookService {
	public List<Book> findAll();
	public void saveBook(Book book);
	
	@Cacheable("books")
	public Book findOne(long id);
	public void delete(long id);
	public List<Book> findByName(String name);
	public List<Book> findByNameAndAuthor(String name, String author);
	public List<Book> findByPrice(long price);
	public List<Book> findByPriceRange(long price1, long price2);
	public List<Book> findByNameMatch(String name);
	public List<Book> findByNamedParam(String name, String author, long price);
}
