package com.wyj.library.service;

import com.wyj.library.mapper.BorrowMapper;
import com.wyj.library.model.Borrow;
import com.wyj.library.model.BorrowExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowService {

    @Autowired
    BorrowMapper borrowMapper;

    public List<Borrow> getAllBorrow(BorrowExample example){
        return borrowMapper.selectByExample(example);
    }
    
    public int insertBorrow(Borrow borrow){
        return borrowMapper.insertSelective(borrow);
    }

    public Borrow getOneBorrow(Integer id){
        return borrowMapper.selectByPrimaryKey(id);
    }

    public int updateBorrow(Borrow borrow){
        return borrowMapper.updateByPrimaryKey(borrow);
    }

    public int deleteBorrow(Integer id){
        return borrowMapper.deleteByPrimaryKey(id);
    }
}
