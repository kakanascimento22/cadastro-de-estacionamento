package com.example.ProjetoFramework.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class PrimeiroController {
	
	@RequestMapping(path = { "/ola", "ola2" })
	
	public String Ola() {
		
		return "olá";
	
		 
	}

}
