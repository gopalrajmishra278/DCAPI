package com.gopal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class EducationDetailsEntity {
    
	@Id
	@GeneratedValue
	private Long caseNum;
	
	private String highestNum;
	
	private String highestDegree;
	
	
	
}
