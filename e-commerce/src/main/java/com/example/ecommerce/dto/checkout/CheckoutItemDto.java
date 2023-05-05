package com.example.ecommerce.dto.checkout;


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
public class CheckoutItemDto {
	
    private String productName;
    private int quantity;
    private double price;
    private long productId;
    private int userId;

}
