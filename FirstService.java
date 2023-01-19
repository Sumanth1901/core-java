package com.xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.FirstAidDTO;
import com.xworkz.repo.RepoFirstAid;

@Component
public class FirstService implements First {
	
	@Autowired
	private RepoFirstAid aid;

	private Validator validator;
	@Autowired
	public FirstService(Validator validator) {
		super();
		this.validator = validator;
	}

	@Override
	public boolean validateAndSave(FirstAidDTO dto) {
		
	Set<ConstraintViolation<FirstAidDTO>> vilation=this.validator.validate(dto);
	if(!vilation.isEmpty())
	{
		System.out.println("it has some errors");
		
		vilation.forEach(e->System.out.println(e.getMessage()));
		return false;
	}
	else {
		System.out.println("data is valid");
		aid.save(dto);

		return true;
		
	}
	}
	
	
	
	
	

}
