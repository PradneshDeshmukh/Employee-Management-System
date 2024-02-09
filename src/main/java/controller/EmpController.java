package controller;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dao.EmpRepository;
import model.Employee;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class EmpController {

	@Autowired
	EmpRepository eRepo;
	
	@GetMapping("/employee")
	public List<Employee> getAllEmployees(){
		
		return eRepo.findAll();
	}
	
	
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee employee) {
		
		return eRepo.save(employee);
	}
	
	@PutMapping(path="/employee")
	public Employee saveOrUpdateEmployee(@RequestBody Employee employee)
	{
		eRepo.save(employee);
		return employee;
	}
	

	
	@GetMapping("/employee/{id}")
	public Optional<Employee> getEmployee(@PathVariable("id")int id)
	{
		return eRepo.findById(id);


	} 
	
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable int id)
	{
		Employee a = eRepo.getOne(id);
		eRepo.delete(a);
		return "deleted";
	}
	
}
