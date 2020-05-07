package com.wyj.library.controller;

import com.wyj.library.model.Borrow;
import com.wyj.library.model.BorrowExample;
import com.wyj.library.service.BorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
