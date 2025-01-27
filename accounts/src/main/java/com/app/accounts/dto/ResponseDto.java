package com.app.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ResponseDto {
  private String statusCode;
  private String statusMessage;
}
