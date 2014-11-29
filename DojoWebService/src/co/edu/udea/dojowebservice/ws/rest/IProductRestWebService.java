package co.edu.udea.dojowebservice.ws.rest;

import java.util.List;

import co.edu.udea.dojowebservice.model.Product;
import co.edu.udea.dojowebservice.model.Store;

public interface IProductRestWebService {

	public List<Store> findStore(String fullName);

	public Product find(String fullName);
}
