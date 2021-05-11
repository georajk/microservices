package com.codergk.department.service;

import com.codergk.department.entity.Department;
import com.codergk.department.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department){

        return departmentRepository.save(department);
    }

    public Department findDepartmentById(Long id){

        return departmentRepository.findDepartmentById(id);
    }
}
