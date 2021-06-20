package com.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Tenant {
	@Id
	@GeneratedValue
	private int tenant_id;
	private int age;
	@OneToOne
	//(mappedBy="tenant")
	@JoinColumn(name = "houseNo")

	private FlatAdress taddress;
	public Tenant(int tenant_id, int age, FlatAdress taddress) {
		super();
		this.tenant_id = tenant_id;
		this.age = age;
		this.taddress = taddress;
	}
	public int getTenant_id() {
		return tenant_id;
	}
	public void setTenant_id(int tenant_id) {
		this.tenant_id = tenant_id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public FlatAdress getTaddress() {
		return taddress;
	}
	public void setTaddress(FlatAdress taddress) {
		this.taddress = taddress;
	}
	@Override
	public String toString() {
		return "Tenant [tenant_id=" + tenant_id + ", age=" + age + ", taddress=" + taddress + "]";
	}
	
	
}

