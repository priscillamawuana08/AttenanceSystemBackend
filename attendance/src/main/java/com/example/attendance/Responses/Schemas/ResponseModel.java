package com.example.attendance.Responses.Schemas;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseModel {
  private boolean error;
  private Object data;
  private int code;
  private String message;



}
