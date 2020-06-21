package org.globomatics.bike.ProductService;

import java.util.List;

import org.globomatics.bike.ProductDao.Product;

public interface IProductService  {
	
	public List<Product> listproduct();
	
	public Product saveproduct (Product p);

}
