package in.balu.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.balu.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

}
