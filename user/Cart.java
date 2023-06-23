//package com.example.finalJpa.user;
//
//import java.util.Date;
//
//import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
//import jakarta.persistence.GenerationType;
//import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToOne;
//import jakarta.persistence.Table;
//import jakarta.persistence.Temporal;
//import jakarta.persistence.TemporalType;
//
//import java.util.Date;
//
//@Entity
//@Table(name = "cart")
//public class Cart {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private int id;
//	private int quantity;
//	private double price;
//
//	@OneToOne
//	@JoinColumn(name = "product_id")
//	private Product product;
//
//	@OneToOne
//	@JoinColumn(name = "userId")
//	private User user;
//
//	@Temporal(TemporalType.TIMESTAMP)
//	private Date addedDate;
//
//	public Cart() {
//		this.addedDate = new Date();
//	}
//
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public int getQuantity() {
//		return quantity;
//	}
//
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//
//	public double getPrice() {
//		return price;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
//
//	public Product getProduct() {
//		return product;
//	}
//
//	public void setProduct(Product product) {
//		this.product = product;
//	}
//
//	public User getUser() {
//		return user;
//	}
//
//	public void setUser(User user) {
//		this.user = user;
//	}
//
//	public Date getAddedDate() {
//		return addedDate;
//	}
//
//	public void setAddedDate(Date addedDate) {
//		this.addedDate = addedDate;
//	}
//
//}
