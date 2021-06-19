package com.repository;

import java.util.List;

import com.entities.Tenant;
import com.exception.TenantNotFoundException;

public interface ITenantRepository {
	
	public Tenant addTenant(Tenant tenant) ;
	public Tenant updateTenant(Tenant tenant) throws TenantNotFoundException;
	public Tenant deleteTenant(Tenant tenant) throws TenantNotFoundException;
	public Tenant viewTenant(int id) throws TenantNotFoundException;
	public List<Tenant> viewAllTenant();
	public Tenant validateTenant(int tenantId);

}
