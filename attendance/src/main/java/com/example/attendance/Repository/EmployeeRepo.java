package com.example.attendance.Repository;

import com.example.attendance.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, UUID> {
}
