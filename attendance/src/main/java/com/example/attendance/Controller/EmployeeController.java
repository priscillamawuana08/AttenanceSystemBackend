package com.example.attendance.Controller;

import com.example.attendance.Exceptions.RecordNotFoundException;
import com.example.attendance.Model.Employee;
import com.example.attendance.Responses.ResponseHandler;
import com.example.attendance.Responses.Schemas.ResponseModel;
import com.example.attendance.Service.EmployeeService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/Employee")
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping("/create")
    public ResponseEntity<ResponseModel> create(@RequestBody @Valid Employee employee) {
        employee.setDateCreated(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        Employee saved = employeeService.save(employee);
        return ResponseHandler.ResponseFormat(
                "Created successfully",
                HttpStatus.OK.value(),
                saved,
                false

        );
    }
    @GetMapping("/all")
    public ResponseEntity<ResponseModel> findAll(){
        List<Employee> list = employeeService.allEmployees();
        return ResponseHandler.ResponseFormat(
                "successful",
                HttpStatus.OK.value(),
                list,
                false

            );
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<ResponseModel> findById(@PathVariable UUID id) {
        Optional<Employee> byId = employeeService.findById(id);
        if (!byId.isPresent()) {
            throw new RecordNotFoundException("No record with this id found: " + id);
        }
        Employee data = byId.get();
        return ResponseHandler.ResponseFormat(
                "Success",
                HttpStatus.OK.value(),
                data,
                false
        );

    }
    @PutMapping("/edit")
    public ResponseEntity<ResponseModel> edit(@RequestBody Employee employee) {
        Optional<Employee> byId = employeeService.findById(employee.getId());
        if (!byId.isPresent()) {
            throw new RecordNotFoundException("No record with this id found: " + employee.getId());
        }
        Employee data = byId.get();
        data.setEmail(employee.getEmail());
        Employee saved = employeeService.save(data);
        return ResponseHandler.ResponseFormat(
                "Updated",
                HttpStatus.OK.value(),
                saved,
                false
        );
    }
}
