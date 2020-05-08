package com.wyj.library.service;

import com.wyj.library.mapper.ReaderMapper;
import com.wyj.library.model.Reader;
import com.wyj.library.model.ReaderExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReaderService {

    @Autowired
    ReaderMapper readerMapper;

    public List<Reader> getAllReader(ReaderExample example){
        return readerMapper.selectByExample(example);
    }

    public int insertReader(Reader reader){
        return readerMapper.insertSelective(reader);
    }

    public Reader getOneReader(Integer id){
        return readerMapper.selectByPrimaryKey(id);
    }

    public int updateReader(Reader reader){
        return readerMapper.updateByPrimaryKey(reader);
    }

    public int deleteReader(Integer id){
        return readerMapper.deleteByPrimaryKey(id);
    }
}
