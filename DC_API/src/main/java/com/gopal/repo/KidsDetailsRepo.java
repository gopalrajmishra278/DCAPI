package com.gopal.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gopal.entity.KidsDetailsEntity;

public interface KidsDetailsRepo extends JpaRepository<KidsDetailsEntity, Serializable>{

}
