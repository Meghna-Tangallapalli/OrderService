package com.orderservice.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "Order")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class OrderEntity {

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private long Id;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Qty")
	private int qty;
	
	@Column(name="Price")
	private long price;

	
		
	}

