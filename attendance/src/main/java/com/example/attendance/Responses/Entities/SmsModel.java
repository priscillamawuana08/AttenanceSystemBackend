package com.example.attendance.Responses.Entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SmsModel {
  private Message message;
  private PhoneNumber phoneNumber;

}
