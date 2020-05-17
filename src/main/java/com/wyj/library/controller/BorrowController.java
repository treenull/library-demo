package com.wyj.library.controller;

import com.wyj.library.model.Borrow;
import com.wyj.library.model.BorrowExample;
import com.wyj.library.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/borrow")
public class BorrowController {

    @Autowired
    BorrowService borrowService;
    @Autowired
    BorrowExample example;

    @GetMapping("/list")
    public String toBorrowList(Model model){
        List<Borrow> allBorrow = borrowService.getAllBorrow(example);
        model.addAttribute("list",allBorrow);
        return "borrow/borrow_list";
    }

    @GetMapping("/add")
    public String toBorrowAdd(){
        return "borrow/borrow_add";
    }

    @PostMapping("/add")
    public String addBorrow(Borrow borrow){
        borrowService.insertBorrow(borrow);
        System.out.println("添加管理员信息"+borrow);
        return "borrow/borrow_list";

    }

    @GetMapping("/edit/{id}")
    public String toEditBorrow(@PathVariable("id") Integer id, Model model){
        Borrow oneBorrow = borrowService.getOneBorrow(id);
        System.out.println(oneBorrow);
        model.addAttribute("borrow",oneBorrow);
        return "borrow/borrow_edit";
    }

    @PutMapping("/edit")
    public String updateBorrow(Borrow borrow){
        borrowService.updateBorrow(borrow);
        System.out.println("修改后的数据"+borrow);
        return "redirect:/borrow/list";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        System.out.println(id);
//        if(id!=null){
//            userService.deleteUser(id);
//        }
        return "redirect:/borrow/list";
    }
}
