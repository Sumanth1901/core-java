package com.xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.dto.FirstAidDTO;
import com.xworkz.dto.MisileDTO;
import com.xworkz.repo.MisileRepo;
import com.xworkz.repo.RepoFirstAid;
@Component
public class MisileServImpl implements MisileServ {

	@Autowired
	private MisileRepo repo;

	private Validator validator;
	@Autowired
	public MisileServImpl(Validator validator) {
		super();
		this.validator = validator;
	}

	@Override
	public boolean validateAndSave(MisileDTO dto) {
		
	Set<ConstraintViolation<MisileDTO>> vilation=this.validator.validate(dto);
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
