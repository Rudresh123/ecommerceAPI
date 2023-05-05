package com.example.ecommerce.dto.cart;


import java.util.List;

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
public class CartDto {

	  private List<CartItemDto> cartItems;
	    private double totalCost;
}
