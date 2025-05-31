package in.balu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.balu.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
