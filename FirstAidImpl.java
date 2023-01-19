package com.xworkz.repo;

import org.springframework.stereotype.Component;

import com.xworkz.dto.FirstAidDTO;

import lombok.NoArgsConstructor;
@Component
@NoArgsConstructor
public class FirstAidImpl implements RepoFirstAid {

	@Override
	public boolean save(FirstAidDTO dtoo) {
		System.out.println("inside save methode");
		System.out.println(" saved "+dtoo);
		return true;
	}

}
