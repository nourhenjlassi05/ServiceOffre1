package com.iset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import com.iset.repository.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.iset.entity.Offre;

@SpringBootApplication
public class ServiceOffreEmploieApplication  implements CommandLineRunner{
	
	
	@Autowired 
	OffreRepository offreRepository; 

	public static void main(String[] args) {
		SpringApplication.run(ServiceOffreEmploieApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception { 
	
	 offreRepository.save(new Offre("Web Design","informatique","AXA", 2, "France"));
	 offreRepository.save(new Offre("Developpeur", "informatique","Talys", 3, "Tunisie")); 
	offreRepository.save(new Offre("Architecte","informatique","SIS", 2, "Allemagne")); 
			  
			  } 

}
