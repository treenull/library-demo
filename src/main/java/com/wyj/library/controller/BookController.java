package com.wyj.library.controller;

import com.wyj.library.model.Book;
import com.wyj.library.model.BookExample;
import com.wyj.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService userService;
    @Autowired
    BookExample example;


    @GetMapping("/list")
    public String toBookList(Model model){
        List<Book> allBook = userService.getAllBook(example);
        model.addAttribute("list",allBook);
        return "book/book_list";
    }

}
