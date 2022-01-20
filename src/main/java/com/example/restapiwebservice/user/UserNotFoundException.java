package com.example.restapiwebservice.user;


// HTTP Status Code
// 2XX -> OK
// 4XX -> Client
// 5XX -> Server

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

// RuntimeException: 실행시 발생하는 예외로 처리
@ResponseStatus(HttpStatus.NOT_FOUND)       //
public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String message) {
        super(message);     // 부모 클래스에 전달 받은 메세지를 반환
    }
}
