package com.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import org.springframework.stereotype.Component;

import com.sun.istack.NotNull;


//@Component
@Entity
//@Table(name = "Tenants")
public class Tenant {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int tenant_id;
	
	//@NotBlank(message = "Tenant name cannot be empty")
	//@NotNull
//	@Size(min=3,max=6)
//	@Pattern(regexp ="^[A-Z][a-z]", message ="length must be 3 and max 6 and dont use numbers")
	//(name = "Tenant name")
	private String name;
	
	//@NotBlank(message = "Tenant age cannot be empty")
	//@NotNull
	//@Column(name = "Tenant age")
	private int age;
	
	@OneToOne
	
	//(mappedBy="tenant")
	@JoinColumn(name = "houseNo")
	private FlatAddress taddress;
	
	
	
	
	
	public Tenant(int tenant_id, String name, int age, FlatAddress taddress) {
		super();
		this.tenant_id = tenant_id;
		this.name = name;
		this.age = age;
		this.taddress = taddress;
	}
	public Tenant() {
		super();
	}
	public int getTenant_id() {
		return tenant_id;
	}
	public void setTenant_id(int tenant_id) {
		this.tenant_id = tenant_id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public FlatAddress getTaddress() {
		return taddress;
	}
	public void setTaddress(FlatAddress taddress) {
		this.taddress = taddress;
	}
	@Override
	public String toString() {
		return "Tenant [tenant_id=" + tenant_id + ", age=" + age + ", taddress=" + taddress + "]";
	}
	
	
}
