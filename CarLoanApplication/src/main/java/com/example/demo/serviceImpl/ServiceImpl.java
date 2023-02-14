package com.example.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Profession;
import com.example.demo.proRepository.ProfessionRepository;
import com.example.demo.serviceInterface.ServiceInterface;

@Service
public class ServiceImpl implements ServiceInterface
{
	@Autowired
	ProfessionRepository pr;

	@Override
	public Profession saveData(Profession profession)
	{		
		return pr.save(profession);
	}

	
}
