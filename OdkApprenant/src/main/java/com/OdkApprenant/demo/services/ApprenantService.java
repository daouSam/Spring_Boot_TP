package com.OdkApprenant.demo.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.OdkApprenant.demo.model.Apprenant;

@Service
public interface ApprenantService {
	
	public void saveApprenant(Apprenant apprenant);

	public List<Apprenant> getAllApprenant();
	
	public Apprenant getById(Long id);
	
	public void saveOrUpdate(Apprenant apprenant);
	
	public void deleteApprenant(Long id);
	
	public void verifierPatch(String login);
	
	public Apprenant autheUser(String login, String password);

}
