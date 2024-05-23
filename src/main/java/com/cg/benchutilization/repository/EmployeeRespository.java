package com.cg.benchutilization.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cg.benchutilization.model.Employee;

@CrossOrigin
@RepositoryRestResource(path="employees")
public interface EmployeeRespository extends JpaRepository<Employee, Long>{

    List<Employee> findByGlobalGroupId(int globalGroupId);

    List<Employee> findBySkillGroupContainingIgnoreCase(String skillGroup);

}
