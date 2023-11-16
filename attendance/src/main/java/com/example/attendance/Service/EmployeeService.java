package com.example.attendance.Service;

import com.example.attendance.Model.Employee;
import com.example.attendance.Repository.EmployeeRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class EmployeeService {
 private EmployeeRepo employeeRepo;

    public List<Employee> allEmployees(){
        return employeeRepo.findAll();
    }

    public Employee save(Employee employee){
        return employeeRepo.save(employee);
    }

    public Employee delete(Employee employee){
        employeeRepo.delete(employee);
        return employee;
    }

    public Optional<Employee> findById(UUID id){
        return employeeRepo.findById(id);
    }
}
