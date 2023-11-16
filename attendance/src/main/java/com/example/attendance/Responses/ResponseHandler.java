package com.example.attendance.Responses;


import com.example.attendance.Responses.Schemas.MultiResponseModel;
import com.example.attendance.Responses.Schemas.ResponseModel;
import com.example.attendance.Responses.Schemas.SmsResponseModel;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Data
public class ResponseHandler {
  public static ResponseEntity<ResponseModel> ResponseFormat(
      String Message,
      int Code,
      Object Data,
      boolean Error
  ) {
    ResponseModel response = new ResponseModel(
        Error, Data, Code, Message
    );

    return new ResponseEntity<>(response, HttpStatus.valueOf(Code));
  }

  public static ResponseEntity<MultiResponseModel> MultipleResponseFormat(
      int Code,
      boolean Error,
      String Message,
      Object PriceList,
      Object RoomTypeList
  ) {
    MultiResponseModel multiResponse = new MultiResponseModel(
        Code, Error, Message, PriceList, RoomTypeList
    );

    return new ResponseEntity<>(multiResponse, HttpStatus.valueOf(Code));
  }

  public static ResponseEntity<SmsResponseModel> SmsResponseFormat(
      int StatusCode,
      boolean Error,
      Object data,
      String Message
  ) {
    SmsResponseModel smsResponseModel = new SmsResponseModel(
        StatusCode, Error, data, Message
    );

    return new ResponseEntity<>(smsResponseModel, HttpStatus.valueOf(StatusCode));
  }
}
