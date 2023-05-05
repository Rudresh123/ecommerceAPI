package com.example.ecommerce.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.dto.ProductDto;
import com.example.ecommerce.model.User;
import com.example.ecommerce.model.WishList;
import com.example.ecommerce.repository.WishListRepository;

@Service
public class WishListService {
	
	  @Autowired
	    WishListRepository wishListRepository;

	    @Autowired
	    ProductService productService;

	    public void createWishlist(WishList wishList) {
	        wishListRepository.save(wishList);
	    }

	    public List<ProductDto> getWishListForUser(User user) {
	        final List<WishList> wishLists = wishListRepository.findAllByUserOrderByCreatedDateDesc(user);
	        List<ProductDto> productDtos = new ArrayList<>();
	        for (WishList wishList: wishLists) {
	            productDtos.add(productService.getProductDto(wishList.getProduct()));
	        }

	        return productDtos;
	    }

}
