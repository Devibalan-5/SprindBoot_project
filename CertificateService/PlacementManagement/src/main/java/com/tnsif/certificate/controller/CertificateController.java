package com.tnsif.certificate.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.tnsif.certificate.Repository.CertificateRepository;
import com.tnsif.certificate.entity.Certificate;

@RestController

public class CertificateController {
	@Autowired
	CertificateRepository repo;
	@PostMapping("/certificate")
	
   public Certificate addCertificate (@RequestBody	Certificate C )
   {
	
		return repo.save(C);
		
   }
	@GetMapping("/certificates")
   public List<Certificate> getCertificates()
 
   {
	   return repo.findAll();
}
   @GetMapping("/Certificate/id")
   public Certificate getCertificate(@PathVariable Long id)
   {
   return repo.findById(id).get();
   
}
   @DeleteMapping("/certificate/{id}")
   public void deleteCertificate(@PathVariable Long id)
   {
	   repo.deleteById(id);
   }
} 
   