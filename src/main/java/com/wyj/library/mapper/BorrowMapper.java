package com.wyj.library.mapper;

import com.wyj.library.model.Borrow;
import com.wyj.library.model.BorrowExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("borrowMapper")
public interface BorrowMapper {
    long countByExample(BorrowExample example);

    int deleteByExample(BorrowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Borrow record);

    int insertSelective(Borrow record);

    List<Borrow> selectByExample(BorrowExample example);

    Borrow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Borrow record, @Param("example") BorrowExample example);

    int updateByExample(@Param("record") Borrow record, @Param("example") BorrowExample example);

    int updateByPrimaryKeySelective(Borrow record);

    int updateByPrimaryKey(Borrow record);
}