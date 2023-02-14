package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Profession;
import com.example.demo.serviceInterface.ServiceInterface;

@Repository
public class ProfessionControllre
{
	@Autowired
	ServiceInterface sr;
	
	@PostMapping("/saveData")
	public ResponseEntity<Profession>  postData(@RequestBody Profession profession)
	{
		Profession pro=sr.saveData(profession);
		
		return new ResponseEntity<Profession>(pro,HttpStatus.CREATED);
		
	}

}
