package com.xworkz.repo;

import org.springframework.stereotype.Component;

import com.xworkz.dto.ResortDTO;
@Component
public class ResortRepoImpl implements ResortRepo {

	@Override
	public boolean save(ResortDTO dto) {
		// TODO Auto-generated method stub
		System.out.println("inside saveing methode");
		System.out.println("saved "+dto);
		return false;
	}

}
