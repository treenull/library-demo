package com.wyj.library.controller;

import com.wyj.library.model.Notice;
import com.wyj.library.model.NoticeExample;
import com.wyj.library.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    NoticeService noticeService;
    @Autowired
    NoticeExample example;


    @GetMapping("/list")
    public String toNoticeList(Model model){
        List<Notice> allNotice = noticeService.getAllNotice(example);
        model.addAttribute("list",allNotice);
        return "notice/notice_list";
    }

}
