package com.wyj.library.controller;

import com.wyj.library.model.Document;
import com.wyj.library.model.DocumentExample;
import com.wyj.library.service.DocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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


    @GetMapping("/add")
    public String toDocumentAdd(){
        return "document/document_add";
    }

    @PostMapping("/add")
    public String addDocument(Document document){
        documentService.insertDocument(document);
        System.out.println("添加管理员信息"+document);
        return "document/document_list";

    }

    @GetMapping("/edit/{id}")
    public String toEditDocument(@PathVariable("id") Integer id, Model model){
        Document oneDocument = documentService.getOneDocument(id);
        System.out.println(oneDocument);
        model.addAttribute("document",oneDocument);
        return "document/document_edit";
    }

    @PutMapping("/edit")
    public String updateDocument(Document document){
        documentService.updateDocument(document);
        System.out.println("修改后的数据"+document);
        return "redirect:/document/list";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        System.out.println(id);
//        if(id!=null){
//            userService.deleteUser(id);
//        }
        return "redirect:/document/list";
    }
}
