package com.xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.FirstAidDTO;
import com.xworkz.dto.ResortDTO;
import com.xworkz.repo.RepoFirstAid;
import com.xworkz.repo.ResortRepo;
@Component
public class ResortServImpl implements Resort {
	
	@Autowired
	private ResortRepo repo;

	private Validator validator;
	@Autowired
	public ResortServImpl(Validator validator) {
		super();
		this.validator = validator;
	}

	@Override
	public boolean validateAndSave(ResortDTO dto) {
		
	Set<ConstraintViolation<ResortDTO>> vilation=this.validator.validate(dto);
	if(!vilation.isEmpty())
	{
		System.out.println("it has some errors");
		
		vilation.forEach(e->System.out.println(e.getMessage()));
		return false;
	}
	else {
		System.out.println("data is valid");
		repo.save(dto);

		return true;
		
	}
	}
	
}
