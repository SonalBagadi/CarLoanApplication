package com.example.demo.proRepository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Profession;

@Repository
public interface ProfessionRepository extends JpaRepository<Profession, Serializable>
{

}
