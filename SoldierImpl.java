package com.xworkz.repo;

import com.xworkz.dto.SoldierDTO;

public class SoldierImpl implements SoldierRepo {

	@Override
	public boolean save(SoldierDTO dto) {
		System.out.println("running dto");
		System.out.println("Dto "+dto);
		return false;
	}

}
