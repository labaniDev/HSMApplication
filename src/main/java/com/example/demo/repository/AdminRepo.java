package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Admin;

public interface AdminRepo extends CrudRepository<Admin,Long>,JpaRepository<Admin,Long>{
	
	Admin  findByUsername(String username);
	
//	@Query("From Admin a WHERE a.userName =:aAdminuser AND a.password =:aPass")
//	Admin getAdminByEmailAndPass(@Param("aAdminuser") String userName, @Param("aPass") String pass);

}
