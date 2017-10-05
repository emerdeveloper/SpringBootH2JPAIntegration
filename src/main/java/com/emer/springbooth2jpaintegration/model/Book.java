package com.emer.springbooth2jpaintegration.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

/**
 * 
 * @author Emerson Javid Gonzalez Morales
 *
 *@Entity used for marking that this POJO is used as entity in the database.
 *@Table specifies the primary table (name book) for the annotated @Entity
 *@ID specifies the primary key 
 * @GeneratedValue indicates generation strategy for value of primary key.
 * @Column: mapped column (in the table) for persistent fields (in Java class).
 */

@Entity
@NamedQuery(name="Book.findByPrice",query="select name,author,price from Book b where b.price=?1")
public class Book implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "author")
	private String author;
	
	@Column(name = "price")
	private long price;

	public Book() {
		super();
	}

	public Book(String name, String author, long price) {
		super();
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override
	public String toString(){
		return String.format("Book: [id = %d, name = '%s', author = '%s', price = '%s']", id, name, author, price);
	}
}