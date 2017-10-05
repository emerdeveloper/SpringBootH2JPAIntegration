package com.emer.springbooth2jpaintegration.repository.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.emer.springbooth2jpaintegration.model.Book;
import com.emer.springbooth2jpaintegration.repository.*;

/**
 * 
 * @author Emerson Javid Gonzalez Morales
 * 
 * This is part of service layer that will be between REST API and Spring Data Repository
 * 
 * @Transaction annotationÂ to perform the database transactions.
 * @Service annotation to indicate that it is service class
 * @Autowired is used for injecting the repository dependency to service layer.
 *
 * This service class is merely a delegation mode to invoke the repositories.
 *
 */

@Service
@Transactional
public class BookServiceImplementation implements BookService{
	@Autowired
	private BookRepository bookRepository;
	@Autowired
	private BookOwnRepository bookOwnRepository;
	@Autowired
	private BookNamedQueryOwnRepository bookNamedQueryOwnRepository;
	@Autowired
	private BookQueryOwnRepository bookQueryOwnRepository;
	
	@Override
	public void delete(long id) {
		bookRepository.delete(id);
	}

	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	@Override
	public Book findOne(long id) {
		System.out.println("Cached Pages");
		return bookRepository.findOne(id);
	}

	@Override
	public List<Book> findByName(String name) {
		return bookQueryOwnRepository.findByName(name);
	}

	@Override
	public List<Book> findByNameAndAuthor(String name, String author) {
		return bookOwnRepository.findByNameAndAuthor(name, author);
	}

	@Override
	public List<Book> findByPrice(long price) {
		return bookNamedQueryOwnRepository.findByPrice(price);
	}

	@Override
	public List<Book> findByPriceRange(long price1, long price2) {
		return bookQueryOwnRepository.findByPriceRange(price1, price2);
	}

	@Override
	public List<Book> findByNameMatch(String name) {
		return bookQueryOwnRepository.findByNameMatch(name);
	}

	@Override
	public List<Book> findByNamedParam(String name, String author, long price) {
		return bookQueryOwnRepository.findByNamedParam(name, author, price);
	}
	
	@Override
	public void saveBook(Book book) {
		bookRepository.save(book);
	}

}
