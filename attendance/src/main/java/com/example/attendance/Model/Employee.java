package com.example.attendance.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    private UUID id;
    private String fullName;
    private String Email;
    private String phoneNumber;
    private String ghanaCardNumber;
    private String dateCreated;
//    @ManyToOne
//    private Organization organization;

}
