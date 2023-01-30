package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Snake {
	
	private String snakeName;
	@Value("9.5")
	private Double snakeLen;
	@Value("black")
	private String snakeColor;
	private String type;
	private Boolean poision;
	
	
	public Snake(@Qualifier("sName") String snakeName,@Qualifier("type") String type,@Qualifier("poision") Boolean poision) {
		super();
		this.snakeName = snakeName;
		this.type = type;
		this.poision = poision;
	}


	@Override
	public String toString() {
		return "Snake [snakeName=" + snakeName + ", snakeLen=" + snakeLen + ", snakeColor=" + snakeColor + ", type="
				+ type + ", poision=" + poision + "]";
	}
	
	

}
