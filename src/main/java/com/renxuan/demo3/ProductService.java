package com.renxuan.demo3;

public class ProductService {
	private CatagoryDao catagoryDao;
	private ProductDao productDao;
	
	
	
	
	public void save() {
		System.out.println("Product Service ");
		catagoryDao.save();
		productDao.save();
	}
}
