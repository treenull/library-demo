package com.wyj.library.service;

import com.wyj.library.mapper.DocumentMapper;
import com.wyj.library.model.Document;
import com.wyj.library.model.DocumentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocumentService {

    @Autowired
    DocumentMapper documentMapper;

    public List<Document> getAllDocument(DocumentExample example){
        return documentMapper.selectByExample(example);
    }
}
