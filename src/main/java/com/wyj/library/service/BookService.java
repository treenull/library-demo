package com.wyj.library.service;

import com.wyj.library.mapper.BookMapper;
import com.wyj.library.model.Book;
import com.wyj.library.model.BookExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookMapper bookMapper;

    public List<Book> getAllBook(BookExample example){
        return bookMapper.selectByExample(example);
    }

}
