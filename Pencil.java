package com.xworkz.configuration.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	@Autowired
	private String pencilName;
	@Autowired
	private Type pentype;
	@Autowired
	private int penprice;
	@Autowired
	@Qualifier("color")
	private String pencolor;
	@Autowired
	private boolean pensharp;
	@Autowired
	private boolean penstolen;
	
	@Override
	public String toString() {
		return "Pencil [pencilName=" + pencilName + ", pentype=" + pentype + ", penprice=" + penprice + ", pencolor="
				+ pencolor + ", pensharp=" + pensharp + ", penstolen=" + penstolen + "]";
	}
}
