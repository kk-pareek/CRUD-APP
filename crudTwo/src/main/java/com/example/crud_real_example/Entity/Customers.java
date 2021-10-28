package com.example.crud_real_example.Entity;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Customers {
	
	@Id
	private Long cId;
	private String firstName;
	private String lastName;
	private String emailId, phone;
	
	@JsonManagedReference
	
	@OneToMany(mappedBy="customer", targetEntity = Sales.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<Sales> sales;

	
	public Customers() {
		super();
	}


	public Customers(Long cId, String firstName, String lastName, String emailId, String phone, List<Sales> sales) {
		super();
		this.cId = cId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.phone = phone;
		this.sales = sales;
	}


	@Override
	public String toString() {
		return "Customers [cId=" + cId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", phone=" + phone + ", sales=" + sales + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(cId, emailId, firstName, lastName, phone, sales);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customers other = (Customers) obj;
		return Objects.equals(cId, other.cId) && Objects.equals(emailId, other.emailId)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(phone, other.phone) && Objects.equals(sales, other.sales);
	}


	public Long getcId() {
		return cId;
	}


	public void setcId(Long cId) {
		this.cId = cId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public List<Sales> getSales() {
		return sales;
	}


	public void setSales(List<Sales> sales) {
		this.sales = sales;
	}


		
}
