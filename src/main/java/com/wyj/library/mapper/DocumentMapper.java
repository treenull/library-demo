package com.wyj.library.mapper;

import com.wyj.library.model.Document;
import com.wyj.library.model.DocumentExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("documentMapper")
public interface DocumentMapper {
    long countByExample(DocumentExample example);

    int deleteByExample(DocumentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Document record);

    int insertSelective(Document record);

    List<Document> selectByExample(DocumentExample example);

    Document selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Document record, @Param("example") DocumentExample example);

    int updateByExample(@Param("record") Document record, @Param("example") DocumentExample example);

    int updateByPrimaryKeySelective(Document record);

    int updateByPrimaryKey(Document record);
}