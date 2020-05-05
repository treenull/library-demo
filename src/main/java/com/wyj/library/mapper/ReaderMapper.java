package com.wyj.library.mapper;

import com.wyj.library.model.Reader;
import com.wyj.library.model.ReaderExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("readerMapper")
public interface ReaderMapper {
    long countByExample(ReaderExample example);

    int deleteByExample(ReaderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Reader record);

    int insertSelective(Reader record);

    List<Reader> selectByExample(ReaderExample example);

    Reader selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Reader record, @Param("example") ReaderExample example);

    int updateByExample(@Param("record") Reader record, @Param("example") ReaderExample example);

    int updateByPrimaryKeySelective(Reader record);

    int updateByPrimaryKey(Reader record);
}