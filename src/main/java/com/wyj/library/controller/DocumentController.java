package com.wyj.library.controller;

import com.wyj.library.model.Document;
import com.wyj.library.model.DocumentExample;
import com.wyj.library.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/document")
public class DocumentController {

    @Autowired
    DocumentService documentService;
    @Autowired
    DocumentExample example;


    @GetMapping("/list")
    public String toDocumentList(Model model){
        List<Document> allDocument = documentService.getAllDocument(example);
        model.addAttribute("list",allDocument);
        return "document/document_list";
    }


}
