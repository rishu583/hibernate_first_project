package com.tut.ProjectWithMaven;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


@Entity
@Table(name = "student_address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "address_Id")
	private int addressId;
	@Column(length = 50,name =  "STREET")
	private String street;
	@Column(length = 100,name = "CITY")
	private String city;
	@Column(name = "is_Open")
	private boolean isOpen;
	@Transient
	private double x;
	@Temporal(TemporalType.DATE)
	@Column(name = "added_Date")
	private Date added_date;
	@Lob
	private byte[] image;
	
	
	public Address(int addressId, String street, String city, boolean isOpen, double x, Date added_date, byte[] image) {
		super();
		this.addressId = addressId;
		this.street = street;
		this.city = city;
		this.isOpen = isOpen;
		this.x = x;
		this.added_date = added_date;
		this.image = image;
	}


	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getAddressId() {
		return addressId;
	}


	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public boolean isOpen() {
		return isOpen;
	}


	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}


	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public Date getAdded_date() {
		return added_date;
	}


	public void setAdded_date(Date added_date) {
		this.added_date = added_date;
	}


	public byte[] getImage() {
		return image;
	}


	public void setImage(byte[] image) {
		this.image = image;
	}


	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", street=" + street + ", city=" + city + ", isOpen=" + isOpen
				+ ", x=" + x + ", added_date=" + added_date + ", image=" + Arrays.toString(image) + "]";
	}
	
	
	
	
	
	

}
