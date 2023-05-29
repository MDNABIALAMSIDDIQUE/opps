package com.validtion.entity;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data

public class LoginData {
		
	@NotBlank(message = "User Name can Not be Empty !!")
	@Size(min=3,max = 12,message = "User Name must be between 3 - 12 Characters")
	private String userName;
	
	
	private String email;
}
