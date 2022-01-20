package com.example.restapiwebservice.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExceptionResponse {
    private Date timestamp;     // 예외 발생 시간
    private String message;     // 예외 벌샹 메세지
    private String details;     // 예외 상태 정보
}
