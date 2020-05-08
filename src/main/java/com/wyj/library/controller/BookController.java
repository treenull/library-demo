package com.wyj.library.controller;

import com.wyj.library.model.Book;
import com.wyj.library.model.BookExample;
import com.wyj.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;
    @Autowired
    BookExample example;


    @GetMapping("/list")
    public String toBookList(Model model){
        List<Book> allBook = bookService.getAllBook(example);
        model.addAttribute("list",allBook);
        return "book/book_list";
    }

    @GetMapping("/add")
    public String toBookAdd(){
        return "book/book_add";
    }

    @PostMapping("/add")
    public String addBook(Book book){
        bookService.insertBook(book);
        System.out.println("添加管理员信息"+book);
        return "book/book_list";

    }

    @GetMapping("/edit/{id}")
    public String toEditBook(@PathVariable("id") Integer id, Model model){
        Book oneBook = bookService.getOneBook(id);
        System.out.println(oneBook);
        model.addAttribute("book",oneBook);
        return "book/book_edit";
    }

    @PutMapping("/edit")
    public String updateBook(Book book){
        bookService.updateBook(book);
        System.out.println("修改后的数据"+book);
        return "redirect:/book/list";
    }

}
