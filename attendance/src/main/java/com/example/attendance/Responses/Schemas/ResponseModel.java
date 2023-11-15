package com.example.attendance.Responses.Schemas;

import com.example.hostel.Students.Models.Student;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Optional;

@Data
public class ResponseModel {
  private boolean error;
  private Object data;
  private int code;
  private String message;

  @JsonCreator
  public ResponseModel(
      @JsonProperty("error") boolean Error,
      @JsonProperty("data") Object Data,
      @JsonProperty("code") int Code,
      @JsonProperty("message") String Message
  ) {
    this.error = Error;
    this.data = Data;
    this.code = Code;
    this.message = Message;
  }

}
