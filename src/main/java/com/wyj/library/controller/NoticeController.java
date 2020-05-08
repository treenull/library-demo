package com.wyj.library.controller;

import com.wyj.library.model.Notice;
import com.wyj.library.model.NoticeExample;
import com.wyj.library.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/add")
    public String toNoticeAdd(){
        return "notice/notice_add";
    }

    @PostMapping("/add")
    public String addNotice(Notice notice){
        noticeService.insertNotice(notice);
        System.out.println("添加管理员信息"+notice);
        return "notice/notice_list";

    }

    @GetMapping("/edit/{id}")
    public String toEditNotice(@PathVariable("id") Integer id, Model model){
        Notice oneNotice = noticeService.getOneNotice(id);
        System.out.println(oneNotice);
        model.addAttribute("notice",oneNotice);
        return "notice/notice_edit";
    }

    @PutMapping("/edit")
    public String updateNotice(Notice notice){
        noticeService.updateNotice(notice);
        System.out.println("修改后的数据"+notice);
        return "redirect:/notice/list";
    }
}
