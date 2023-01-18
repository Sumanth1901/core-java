package com.xworkz.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class SoldierDTO extends AbstractAuditDTO  {
	@NotNull
	@NotBlank
	@Size(min = 3,max = 10,message = "must be correct size")
	private String name;
	@Max(10000)
	@Min(1)
	private int id;
	@NotBlank
	private String rank;
	@NotBlank
	@NotNull
	public String country;
	

}
