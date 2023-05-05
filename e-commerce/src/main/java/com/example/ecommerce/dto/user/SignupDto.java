package com.example.ecommerce.dto.user;


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
public class SignupDto {

	   private String firstName;
	    private String lastName;
	    private String email;
	    private String password;
}
