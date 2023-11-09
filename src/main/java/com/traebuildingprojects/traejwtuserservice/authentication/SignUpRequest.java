package com.traebuildingprojects.traejwtuserservice.authentication;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SignUpRequest {
	String username;
	String firstName;
	String lastName;
	String email;
	String password;
	

}