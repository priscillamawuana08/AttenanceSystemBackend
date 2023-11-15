package com.example.attendance.Responses.Schemas;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SmsResponseModel {
  private int statusCode;
  private boolean error;
  private Object data;
  private String message;

  @JsonCreator
  public SmsResponseModel(
      @JsonProperty("statusCode") int StatusCode,
      @JsonProperty("error") boolean Error,
      @JsonProperty("data") Object Data,
      @JsonProperty("message") String Message
  ) {
    this.error = Error;
    this.data = Data;
    this.statusCode = StatusCode;
    this.message = Message;
  }

}
