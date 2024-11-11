package com.test;

public class BookBean {
	private String bcode;
	private String bname;
	private String author;
	private double price;
	private int qty;
	public BookBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getBcode() {
		return bcode;
	}
	public void setBcode(String bcode) {
		this.bcode = bcode;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "BookBean [bcode=" + bcode + ", bname=" + bname + ", author=" + author + ", price=" + price + ", qty="
				+ qty + "]";
	}
	
	

}
