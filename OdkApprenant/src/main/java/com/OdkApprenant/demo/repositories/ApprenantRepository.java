package com.OdkApprenant.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.OdkApprenant.demo.model.Apprenant;

@Repository
public interface ApprenantRepository extends JpaRepository<Apprenant, Long> {
	public Apprenant findByLoginAndPassword(String login,String password);
}
