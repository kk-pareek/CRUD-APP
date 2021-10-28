package com.example.crud_real_example.Entity;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Sales {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long sId;
	private String salesChannel;
	private Long orderNumber, currencyId, netAmount, tax, shippingCost, grossAmount;
	
	@JsonBackReference
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="customerId")
	private Customers customer;


	public Sales(Long sId, String salesChannel, Long orderNumber, Long currencyId, Long netAmount, Long tax,
			Long shippingCost, Long grossAmount, Customers customer) {
		super();
		this.sId = sId;
		this.salesChannel = salesChannel;
		this.orderNumber = orderNumber;
		this.currencyId = currencyId;
		this.netAmount = netAmount;
		this.tax = tax;
		this.shippingCost = shippingCost;
		this.grossAmount = grossAmount;
		this.customer = customer;
	}


	@Override
	public int hashCode() {
		return Objects.hash(currencyId, customer, grossAmount, netAmount, orderNumber, sId, salesChannel, shippingCost,
				tax);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sales other = (Sales) obj;
		return Objects.equals(currencyId, other.currencyId) && Objects.equals(customer, other.customer)
				&& Objects.equals(grossAmount, other.grossAmount) && Objects.equals(netAmount, other.netAmount)
				&& Objects.equals(orderNumber, other.orderNumber) && Objects.equals(sId, other.sId)
				&& Objects.equals(salesChannel, other.salesChannel) && Objects.equals(shippingCost, other.shippingCost)
				&& Objects.equals(tax, other.tax);
	}


	public Sales() {
		super();
	}


	public Long getsId() {
		return sId;
	}


	public void setsId(Long sId) {
		this.sId = sId;
	}


	public String getSalesChannel() {
		return salesChannel;
	}


	public void setSalesChannel(String salesChannel) {
		this.salesChannel = salesChannel;
	}


	public Long getOrderNumber() {
		return orderNumber;
	}


	public void setOrderNumber(Long orderNumber) {
		this.orderNumber = orderNumber;
	}


	public Long getCurrencyId() {
		return currencyId;
	}


	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
	}


	public Long getNetAmount() {
		return netAmount;
	}


	public void setNetAmount(Long netAmount) {
		this.netAmount = netAmount;
	}


	public Long getTax() {
		return tax;
	}


	public void setTax(Long tax) {
		this.tax = tax;
	}


	public Long getShippingCost() {
		return shippingCost;
	}


	public void setShippingCost(Long shippingCost) {
		this.shippingCost = shippingCost;
	}


	public Long getGrossAmount() {
		return grossAmount;
	}


	public void setGrossAmount(Long grossAmount) {
		this.grossAmount = grossAmount;
	}


	public Customers getCustomer() {
		return customer;
	}


	public void setCustomer(Customers customer) {
		this.customer = customer;
	}
	
}

