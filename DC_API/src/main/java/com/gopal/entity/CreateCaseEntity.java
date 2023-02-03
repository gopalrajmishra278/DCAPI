package com.gopal.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity
@Table
@Data
public class CreateCaseEntity {
	
	@Id
	private Long appId;
	
}
