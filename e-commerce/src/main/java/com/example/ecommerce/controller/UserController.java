package com.example.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.dto.ResponseDto;
import com.example.ecommerce.dto.user.SignInDto;
import com.example.ecommerce.dto.user.SignInReponseDto;
import com.example.ecommerce.dto.user.SignupDto;
import com.example.ecommerce.service.UserService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RequestMapping("user")
@RestController
@Tag(name="UserAccountApi")
public class UserController {
	
	  @Autowired
	    UserService userService;



	    // signup

	    @PostMapping("/signup")
	    public ResponseDto signup(@RequestBody SignupDto signupDto) {
	        return userService.signUp(signupDto);
	    }


	    // signin

	    @PostMapping("/signin")
	    public SignInReponseDto signIn(@RequestBody SignInDto signInDto) {
	        return userService.signIn(signInDto);
	    }

}
