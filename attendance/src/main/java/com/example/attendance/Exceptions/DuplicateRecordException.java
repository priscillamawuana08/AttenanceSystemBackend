package com.example.attendance.Exceptions;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DuplicateRecordException extends RuntimeException {
  private String message;
}