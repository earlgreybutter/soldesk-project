package com.example.demo.dto;

import java.util.Date;

import lombok.Data;

@Data
public class StuReplDto {
    private int strpId;
    private int stuId;
    private int userId;
    private String strpContent;
    private Date strpCreatedDate;
    private String strpPos;
    private String strpRef;
    private String strpDep;
}