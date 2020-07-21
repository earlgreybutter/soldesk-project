package com.example.demo.dto;

import java.util.Date;

import lombok.Data;

@Data
public class CmuReplDto {
    private int cmrpId;
    private int stuId;
    private int userId;
    private String cmrpContent;
    private Date cmrpCreatedDate;
    private String cmrpPos;
    private String cmrpRef;
    private String cmrpDep;
}