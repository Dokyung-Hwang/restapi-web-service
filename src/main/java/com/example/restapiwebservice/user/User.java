package com.example.restapiwebservice.user;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

// Domain class
@Data       // lombok
@AllArgsConstructor     // 모든 필드에 대해서 매개변수로 받는 생성자
public class User {
    private Integer id;
    private String name;
    private Date joinDate;
}