package com.gopal.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
public class KidsDetailsEntity {

    @Id
    @GeneratedValue
	private Long caseNum;
	
	private String kidName;
	
	private String kidAge;
	
	private Long kidSsn;
	
	
	
	
}
