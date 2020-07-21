package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.StuReplDto;
import com.example.demo.mapper.StuReplMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StuReplServiceImpl implements StuReplService {

    @Autowired
    private StuReplMapper stuReplMapper;

    @Override
    public List<StuReplDto> selectStuReplList() throws Exception {
     
        return stuReplMapper.selectStuReplList();
    }

    @Override
    public void insertStuReplList(StuReplDto sturepl) throws Exception {
       
        stuReplMapper.insertStuReplList(sturepl);

    }

    @Override
    public void updateStuRepl(StuReplDto sturepl) throws Exception {
       
        stuReplMapper.updateStuRepl(sturepl);
    }

    @Override
    public void deleteStuRepl(int strpId) throws Exception {
        
        stuReplMapper.deleteStuRepl(strpId);
    }

    
}