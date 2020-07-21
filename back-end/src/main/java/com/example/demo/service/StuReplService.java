package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.StuReplDto;

public interface StuReplService {

    List<StuReplDto> selectStuReplList() throws Exception;

    void insertStuReplList(StuReplDto sturepl) throws Exception;

    void updateStuRepl(StuReplDto sturepl) throws Exception;

    void deleteStuRepl(int strpId) throws Exception;

}