package com.gopal.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gopal.entity.CreateCaseEntity;

public interface CreateCaseRepo extends JpaRepository<CreateCaseEntity, Serializable> {

}
