package com.gopal.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.gopal.binding.CreateCase;
import com.gopal.entity.CreateCaseEntity;
import com.gopal.repo.CreateCaseRepo;

@Service //Spring Bean
public class CreateCaseServiceImpl implements CreateCaseService {
	
	@Autowired
	private CreateCaseRepo caseRepo; 
	
	private static final String REST_URL = "localhost://8081/citizenApp";
		
	
    @Override
	public String createCaseApp(CreateCase app) {
		
		     Long appId = app.getAppId();
		     
		     
		     WebClient webClient = WebClient.create();
		     
		     String apId = webClient.get()
		                             .uri(REST_URL, appId)
		                             .retrieve()
		                             .bodyToMono(String.class)
		                             .block();
		         
		     if("{appId}".equals(apId)) {
					
					CreateCaseEntity entity = new CreateCaseEntity();
					
					BeanUtils.copyProperties(appId, entity);
					
					caseRepo.save(entity);
					
					
					return "Citizen App Case Number Created, App Id : {appId}";
					
				}
				
				                          
				     return "Invalid credentials";     
		     }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
