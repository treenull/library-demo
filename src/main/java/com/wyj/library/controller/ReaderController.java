package com.wyj.library.controller;

import com.wyj.library.model.Reader;
import com.wyj.library.model.ReaderExample;
import com.wyj.library.service.ReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Service
@RequestMapping("/reader")
public class ReaderController {

    @Autowired
    ReaderService readerService;
    @Autowired
    ReaderExample example;


    @GetMapping("/list")
    public String toReaderList(Model model){
        List<Reader> allReader = readerService.getAllReader(example);
        model.addAttribute("list",allReader);
        return "reader/reader_list";
    }

    @GetMapping("/add")
    public String toReaderAdd(){
        return "reader/reader_add";
    }

    @PostMapping("/add")
    public String addReader(Reader reader){
        readerService.insertReader(reader);
        System.out.println("添加管理员信息"+reader);
        return "reader/reader_list";

    }

    @GetMapping("/edit/{id}")
    public String toEditReader(@PathVariable("id") Integer id, Model model){
        Reader oneReader = readerService.getOneReader(id);
        System.out.println(oneReader);
        model.addAttribute("reader",oneReader);
        return "reader/reader_edit";
    }

    @PutMapping("/edit")
    public String updateReader(Reader reader){
        readerService.updateReader(reader);
        System.out.println("修改后的数据"+reader);
        return "redirect:/reader/list";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        System.out.println(id);
//        if(id!=null){
//            userService.deleteUser(id);
//        }
        return "redirect:/reader/list";
    }
}
