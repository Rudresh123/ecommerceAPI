package com.example.ecommerce.dto.cart;


import jakarta.validation.constraints.NotNull;
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
public class AddToCartDto {
	
	   private Integer id;
	    private @NotNull Integer productId;
	    private @NotNull Integer quantity;


}
