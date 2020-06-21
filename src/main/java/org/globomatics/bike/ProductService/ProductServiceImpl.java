package org.globomatics.bike.ProductService;

import java.util.List;

import org.globomatics.bike.ProductDao.IProductDao;
import org.globomatics.bike.ProductDao.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl  implements IProductService{
	
	@Autowired
	private IProductDao productdao;
	
	
	public List<Product> listproduct() {
		
		return productdao.findAll();
	}


	@Override
	public Product saveproduct(Product p) {
		// TODO Auto-generated method stub
		return productdao.save(p);
	}
	
	

}
