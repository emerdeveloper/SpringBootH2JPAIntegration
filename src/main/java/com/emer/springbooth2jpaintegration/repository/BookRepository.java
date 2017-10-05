package com.emer.springbooth2jpaintegration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emer.springbooth2jpaintegration.model.Book;

/**
 * 
 * @author Emerson Javid Gonzalez Morales
 *
 *I have used JpaRepository, which is the special version specific to the JPA technology
 *To use JpaRepository I have to implement my own Repository methods
 *
 *This code is sufficient to perform the basic operations like find, save, delete
 *
 */

public interface BookRepository extends JpaRepository<Book, Long>{

}
