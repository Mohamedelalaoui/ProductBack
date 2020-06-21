package org.globomatics.bike.ProductDao;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	 @Column
    private Long  productId;
	 @Column
	private String productName;
	 @Column
	private String ProductCode;
	 @Column
	private Date  ReleaseDate ;
	 @Column
    private Double Price;
	 
	 @Column
    private String Description;
	 @Column
    private Double StarRating;
	public Long getProductId() {
		return productId;
	}
	public void setProductId(Long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCode() {
		return ProductCode;
	}
	public void setProductCode(String productCode) {
		ProductCode = productCode;
	}
	public Date getReleaseDate() {
		return ReleaseDate;
	}
	public void setReleaseDate(Date releaseDate) {
		ReleaseDate = releaseDate;
	}
	public Double getPrice() {
		return Price;
	}
	public void setPrice(Double price) {
		Price = price;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public Double getStarRating() {
		return StarRating;
	}
	public void setStarRating(Double starRating) {
		StarRating = starRating;
	}
    
    
    
    
   
    
    
	
	
    
    
	
	

}
