package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Employee;

public interface EmpRepository  extends JpaRepository<Employee, Integer> {

	
	
}
