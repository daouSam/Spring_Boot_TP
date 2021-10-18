package com.OdkApprenant.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.OdkApprenant.demo.model.Apprenant;
import com.OdkApprenant.demo.repositories.ApprenantRepository;
@Service
@Transactional
public class ApprenantServiceImp implements ApprenantService {
	
	@Autowired
	ApprenantRepository apprenantRepository;

	@Override
	public List<Apprenant> getAllApprenant() {
		
		return (List<Apprenant>)apprenantRepository.findAll();
	}

	@Override
	public Apprenant getById(Long id) {
		
		return apprenantRepository.findById(id).get();
	}

	@Override
	public void saveOrUpdate(Apprenant apprenant) {
		
		apprenantRepository.save(apprenant);
	}

	@Override
	public void deleteApprenant(Long id) {
		
		apprenantRepository.deleteById(id);
	}

	@Override
	public void saveApprenant(Apprenant apprenant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void verifierPatch(String login) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Apprenant autheUser(String login, String password) {
		
		return apprenantRepository.findByLoginAndPassword(login, password);
	}

	

	

}
