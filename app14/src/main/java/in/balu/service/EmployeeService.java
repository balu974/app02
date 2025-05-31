package in.balu.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.balu.dao.AddressRepo;
import in.balu.dao.EmployeeRepo;
import in.balu.entity.Address;
import in.balu.entity.Employee;

@Service
public class EmployeeService {
	@Autowired
	private AddressRepo addressRepo;
	@Autowired
	private EmployeeRepo employeeRepo;
	
	public void save() {
		Employee e = new Employee();
		e.setEname("AAA");
		e.setEsal(50000.0);
		
		Address a1 = new Address();
		a1.setCity("VJA");
		a1.setState("AP");
		a1.setCountry("INDIA");
		a1.setType("Permanent");
		
		Address a2 = new Address();
		a2.setCity("HYD");
		a2.setState("TS");
		a2.setCountry("INDIA");
		a2.setType("Present");
		
		e.setAddList(Arrays.asList(a1,a2));
		a1.setEmployee(e);
		a2.setEmployee(e);
		
		List<Address> asList = Arrays.asList(a1,a2);
		
		employeeRepo.save(e);
		
		Employee employee = employeeRepo.findById(1).get();
		System.out.println(employee);
	}
}
