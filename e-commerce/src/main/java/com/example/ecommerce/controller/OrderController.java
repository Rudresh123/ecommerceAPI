package com.example.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.dto.checkout.CheckoutItemDto;
import com.example.ecommerce.dto.checkout.StripeResponse;
import com.example.ecommerce.service.AuthenticationService;
import com.example.ecommerce.service.OrderService;
import com.stripe.exception.StripeException;
import com.stripe.model.checkout.Session;

import io.swagger.v3.oas.annotations.tags.Tag;


@RestController	
@RequestMapping("/order")
@Tag(name="OrderProductApi")
public class OrderController {
	
	 @Autowired
	    private AuthenticationService authenticationService;

	    @Autowired
	    private OrderService orderService;

	    // stripe session checkout api

	    @PostMapping("/create-checkout-session")
	    public ResponseEntity<StripeResponse> checkoutList(@RequestBody List<CheckoutItemDto> checkoutItemDtoList)
	            throws StripeException {
	        Session session = orderService.createSession(checkoutItemDtoList);
	        StripeResponse stripeResponse = new StripeResponse(session.getId());
	        return new ResponseEntity<>(stripeResponse, HttpStatus.OK);
	        
	    }

}
