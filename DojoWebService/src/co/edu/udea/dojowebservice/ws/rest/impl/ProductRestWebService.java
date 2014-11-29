package co.edu.udea.dojowebservice.ws.rest.impl;

import java.util.List;

import javax.ws.rs.GET;

import co.edu.udea.dojowebservice.model.Product;
import co.edu.udea.dojowebservice.model.Store;
import co.edu.udea.dojowebservice.persistence.dao.ProductDAO;
import co.edu.udea.dojowebservice.ws.rest.IProductRestWebService;

public class ProductRestWebService implements IProductRestWebService{

	private ProductDAO productDAO;
	
	public ProductRestWebService(){
		this.productDAO = new ProductDAO();
	}
	
	@GET
	@Override
	public List<Store> findStore(String fullName) {
		// TODO Auto-generated method stub
		return productDAO.findStore(fullName);
	}

	@Override
	public Product find(String fullName) {
		// TODO Auto-generated method stub
		return null;
	}

}
