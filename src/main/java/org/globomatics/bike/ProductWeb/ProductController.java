package org.globomatics.bike.ProductWeb;

import java.util.List;

import org.globomatics.bike.ProductDao.Product;
import org.globomatics.bike.ProductService.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class ProductController {
	
	@Autowired
	private IProductService productservice;
	@RequestMapping(value="/api/Products",method=RequestMethod.POST)	
	public Product saveproduct( @RequestBody Product p) {
		return  productservice.saveproduct(p);
		
	}
	
	@GetMapping(value="/api/Products")
	public List<Product> Listproduct(){
		return productservice.listproduct();
		
	}
	

}
