package com.xworkz.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	private String eName;
	private Type etype;
	@Value("ka14456787654")
	private String enumber;
	@Value("2.0")
	private Double eversion;
	private String ecompany;
	private String estroke;
	
	
	@Autowired
	public Engine(@Qualifier("engName") String eName,@Qualifier("etype") Type etype, String ecompany) {
		super();
		this.eName = eName;
		this.etype = etype;
		this.ecompany = ecompany;
	}
	
	@Autowired
	@Qualifier("stroke")
	public void setEstroke(String estroke) {
		this.estroke = estroke;
	}

	@Override
	public String toString() {
		return "Engine [eName=" + eName + ", etype=" + etype + ", enumber=" + enumber + ", eversion=" + eversion
				+ ", ecompany=" + ecompany + ", estroke=" + estroke + "]";
	}
	
	

}
