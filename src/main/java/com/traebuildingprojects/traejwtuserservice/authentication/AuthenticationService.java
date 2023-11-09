package com.traebuildingprojects.traejwtuserservice.authentication;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.traebuildingprojects.traejwtuserservice.appuser.AppRole;
import com.traebuildingprojects.traejwtuserservice.appuser.AppUser;
import com.traebuildingprojects.traejwtuserservice.appuser.AppUserRepository;
import com.traebuildingprojects.traejwtuserservice.jwt.JwtService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
	
	private final AppUserRepository appUserRepository;
	private final PasswordEncoder passwordEncoder;
	private final JwtService jwtService;
	private final AuthenticationManager authenticationManager;
	
	
	public JwtAuthenticationResponse signup(SignUpRequest request) {
		
		AppUser user = AppUser
					.builder()
					.username(request.getUsername())
					.password(passwordEncoder.encode(request.getPassword()))
					.firstname(request.getFirstName())
					.lastname(request.getLastName())
					.email(request.getEmail())
					.appRole(AppRole.ROLE_USER)
					.build();
		
		appUserRepository.save(user);
		var jwt = jwtService.getToken(user);
		
		return JwtAuthenticationResponse.builder().token(jwt).build();
		
	}
	
	public JwtAuthenticationResponse signin(LoginRequest request) {
		authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
		var user = appUserRepository.findByUsername(request.getUsername())
				.orElseThrow(() -> new IllegalArgumentException("Invalid email or password."));
		var jwt = jwtService.getToken(user);
		return JwtAuthenticationResponse.builder().token(jwt).build();	
				
	
	
	}

}

