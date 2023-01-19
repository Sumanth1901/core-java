package com.xworkz.repo;

import org.springframework.stereotype.Component;

import com.xworkz.dto.MisileDTO;
@Component
public class MisileRepoImpl implements MisileRepo {

	@Override
	public boolean save(MisileDTO mis) {
		System.out.println("inside saveing ");
		System.out.println("saved " +mis);
		return true;
	}

}
