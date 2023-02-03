package com.gopal.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gopal.binding.CitizenApp;
import com.gopal.service.CitizenAppRegService;

@RestController
public class CreateCaseRestController {
	
	@Autowired
	private CitizenAppRegService service;
	
	@PostMapping("/createcase")
	public ResponseEntity<String> registerCitizen(@RequestBody CreateCase case){
	
		
		String response = service.registerCitizenApp(app);
		
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
}
