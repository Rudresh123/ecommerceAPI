package com.example.ecommerce.dto.cart;

import com.example.ecommerce.model.Cart;
import com.example.ecommerce.model.Product;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CartItemDto {

	   private Integer id;
	    private Integer quantity;
	    private Product product;
	    
	    public CartItemDto(Cart cart) {
	        this.id = cart.getId();
	        this.quantity = cart.getQuantity();
	        this.setProduct(cart.getProduct());
	    }
}
