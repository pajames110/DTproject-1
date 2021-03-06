package com.james.ajkartbackend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.james.ajkartbackend.model.Supplier;

@Repository
public interface SupplierDAO {

	public boolean save(Supplier supplier);
	public boolean update(Supplier supplier);
	public boolean delete(Supplier supplier);
	public Supplier get(String i);
	
	public List<Supplier> list();
}
