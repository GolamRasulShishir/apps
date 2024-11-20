package com.jtspringproject.JtSpringProject.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.Collections;
import java.util.List;

@Entity(name="PRODUCT")
public class Product implements Shoppable {
	@Id
	@Column(name = "product_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String image;

	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category;
	
	private int quantity;
	
	private int price;
	
	private int weight;
	
	private String description;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}


	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	@ManyToOne
    @JoinColumn(name = "customer_id")
    private User customer;
	
	@Override
	public int getPrecio() {
		return this.price;
	}

	@Override
	public void add(Shoppable item) {
		throw new UnsupportedOperationException("Cannot add items to a product");
	}

	@Override
	public void remove(Shoppable item) {
		throw new UnsupportedOperationException("Cannot remove items from a product");
	}

	@Override
	public List<Shoppable> getChildren() {
		return Collections.emptyList();
	}
}
