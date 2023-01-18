package com.xworkz.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.ValidatorFactory;
import javax.xml.validation.Validator;

import com.xworkz.dto.SoldierDTO;
import com.xworkz.repo.SoldierRepo;

import io.quarkus.hibernate.validator.runtime.jaxrs.QuarkusRestViolationExceptionMapper.ViolationReport.Violation;

public class SoldierServiceImple implements SoldierService {

	private SoldierRepo repo;

	public SoldierServiceImple() {
		System.out.println("created soldier imple with no args const");
	}
	
	public void setRepo(SoldierRepo repo) {
		this.repo = repo;
	}

	@Override
	public boolean validateAndSave(SoldierDTO dto) {
		System.out.println("starting validate and save");
		System.out.println("dto is "+dto);

		ValidatorFactory factory=Validation.buildDefaultValidatorFactory();
		javax.validation.Validator validator= factory.getValidator();

		Set<ConstraintViolation<SoldierDTO>> set=validator.validate(dto);

		if(!set.isEmpty())
		{
			System.out.println("there are validation errors");

			set.forEach(v->System.out.println("violations are "+v.getMessage()));
			

		return false;
	}
	else{
		
		System.out.println("data is valid ");
		repo.save(dto);
		return true;

	}
}


}
