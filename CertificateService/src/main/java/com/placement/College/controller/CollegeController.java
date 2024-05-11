package com.placement.College.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.placement.College.entity.College;
import com.placement.College.repository.CollegeRepository;


@RestController
public class CollegeController {
	
	
	
	@Autowired
	private CollegeRepository repo;
	
	@GetMapping("/college")
	public List<College> getcolleges()
	{
		return repo.findAll();
	}
	
	@GetMapping("/college/{id}")
	public College getCollege(@PathVariable Long id)
	{
		return repo.findById(id).get();
	}
	
	@PostMapping("/college")
	public College createCollege(@RequestBody College college)
	{
		return repo.save(college);
	}
	
	@PutMapping("/college/{id}")
	public College updateCollege(@RequestBody College college,@PathVariable Long id)
	{
		college.setId(id);
		return repo.save(college);
	}
	
	@DeleteMapping("/college/{id}")
	public void deleteCollege(@PathVariable Long id)
	{
		repo.deleteById(id);
	}

}
