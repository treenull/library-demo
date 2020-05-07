package com.wyj.library.controller;

import com.wyj.library.model.Reader;
import com.wyj.library.model.ReaderExample;
import com.wyj.library.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
@RequestMapping("/reader")
public class ReaderController {

    @Autowired
    ReaderService userService;
    @Autowired
    ReaderExample example;


    @GetMapping("/list")
    public String toBookList(Model model){
        List<Reader> allReader = userService.getAllReader(example);
        model.addAttribute("list",allReader);
        return "reader/reader_list";
    }
}
