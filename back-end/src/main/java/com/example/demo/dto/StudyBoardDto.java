package com.example.demo.dto;

import java.util.Date;

import lombok.Data;

@Data
public class StudyBoardDto {
    private int stuId;
    private int userId;
    private String stuTitle;
    private String stuContent;
    private int stuHitCnt;
    private Date stuCreatedDate;
    private String stuLocal;
    private String stuLang;
}
