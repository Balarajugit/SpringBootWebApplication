package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "ProductTable")
public class Product {
	@Id
	@GeneratedValue
	private Integer id;
	private String pCode;
	private String pName;
	private Double pCost;
	public Product() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Double getpCost() {
		return pCost;
	}
	public void setpCost(Double pCost) {
		this.pCost = pCost;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pCode=" + pCode + ", pName=" + pName + ", pCost=" + pCost + "]";
	}
	

}
