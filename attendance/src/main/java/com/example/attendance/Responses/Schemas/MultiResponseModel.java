package com.example.attendance.Responses.Schemas;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class MultiResponseModel {
  private boolean error;
  private Object priceList;
  private Object roomTypeList;
  private int code;
  private String message;

  @JsonCreator
  public MultiResponseModel(
      @JsonProperty("code") int Code,
      @JsonProperty("error") boolean Error,
      @JsonProperty("message") String Message,
      @JsonProperty("priceList") Object PriceList,
      @JsonProperty("roomTypeList") Object RoomTypeList
  ) {
    this.code = Code;
    this.error = Error;
    this.message = Message;
    this.priceList = PriceList;
    this.roomTypeList = RoomTypeList;
  }
}
