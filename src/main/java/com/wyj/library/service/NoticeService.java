package com.wyj.library.service;

import com.wyj.library.mapper.NoticeMapper;
import com.wyj.library.model.Notice;
import com.wyj.library.model.NoticeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeService {

    @Autowired
    NoticeMapper noticeMapper;

    public List<Notice> getAllNotice(NoticeExample example){
        return noticeMapper.selectByExample(example);
    }

    public int insertNotice(Notice notice){
        return noticeMapper.insertSelective(notice);
    }

    public Notice getOneNotice(Integer id){
        return noticeMapper.selectByPrimaryKey(id);
    }

    public int updateNotice(Notice notice){
        return noticeMapper.updateByPrimaryKey(notice);
    }

    public int deleteNotice(Integer id){
        return noticeMapper.deleteByPrimaryKey(id);
    }

}
