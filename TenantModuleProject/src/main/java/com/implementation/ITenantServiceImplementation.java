/**
 * 
 */
package com.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.advice.TenantNotFoundException;
import com.entities.Tenant;
import com.repository.ITenantRepository;
import com.service.ITenantService;

/**
 * @author Mahesh babu 
 *
 */

@Service
public class ITenantServiceImplementation implements ITenantService {
	
List<Tenant> tenant_list;
Tenant tenant;
	
	@Autowired(required=true)
	ITenantRepository terepo;
	
	
	
	
	
	
	
	//method to add tenant adding tenant (check whether there is a valid address so that tenant can be added)
	@Override
	public Tenant addTenant(Tenant tenant) {
		// TODO Auto-generated method stub
		Tenant t = terepo.save(tenant);
		return t;
	}

	
	//updating tenant name, age and address
	@Override
	public Tenant updateTenant(Tenant tenant) throws Exception {
		Tenant t1 = null;
	
		int id=tenant.getTenant_id();
		Supplier<Exception> s1 = ()->new TenantNotFoundException("Tenant id is not present in the database");
				
		t1 = terepo.findById(id).orElseThrow(s1);
		t1.setName(tenant.getName());
		t1.setAge(tenant.getAge());
	    t1.setTaddress(tenant.getTaddress());
		terepo.save(t1);
		return t1;
			
	}

	@Override
	public Tenant viewTenant(int id) throws Exception {
		Supplier<Exception> s1 = ()->new TenantNotFoundException("Tenant id is not present in the database");
		Tenant t1=null;
			t1 = terepo.findById(id).orElseThrow(s1);
		
		//Optional<Tenant> t = terepo.findById(id);
		return t1;
	}
	
	
	
	

	@Override
	public List<Tenant> viewAllTenant() {
		// TODO Auto-generated method stub
		tenant_list=new ArrayList<>();
		tenant_list=terepo.findAll();
		return tenant_list;
		
	}
	
	//delete tenant
	@Override
	public String deleteTenant() throws TenantNotFoundException {
		// TODO Auto-generated method stub
		int id=tenant.getTenant_id();
		Supplier<Exception> s1 = ()->new TenantNotFoundException("Tenant id is not present in the database");
		Tenant t1=null;
		try {
			t1 = terepo.findById(id).orElseThrow(s1);
			terepo.deleteAll();
			return "Tenants are succesfully deleted";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return e.toString();
		}
		
		
		
	}

	@Override
	public String deleteTenant(int id) throws TenantNotFoundException {
		Supplier<Exception> s1 = ()->new TenantNotFoundException("Tenant id is not present in the database");
		Tenant t1=null;
		try {
			t1 = terepo.findById(id).orElseThrow(s1);
			terepo.delete(t1);
			return "Tenant with id : "+id+" is succesfully deleted";
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			return e.toString(); 
		}
		//Optional<Tenant> t = terepo.findById(id);
		
	}
	
	


	
	
	
//	@Override
//	public Tenant validateTenant(int tenantId) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}


	


	
	

	

}
