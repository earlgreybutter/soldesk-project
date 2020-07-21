package com.example.demo.mapper;

import java.util.List;

import com.example.demo.dto.StuReplDto;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StuReplMapper {

    List<StuReplDto> selectStuReplList() throws Exception;

    void insertStuReplList(StuReplDto sturepl) throws Exception;

    void updateStuRepl(StuReplDto sturepl) throws Exception;

    void deleteStuRepl(int strpId) throws Exception;
}