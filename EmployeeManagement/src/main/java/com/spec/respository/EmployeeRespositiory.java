package com.spec.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spec.entites.Employee;
@Repository
public interface EmployeeRespositiory extends JpaRepository<Employee,Integer> {

}
