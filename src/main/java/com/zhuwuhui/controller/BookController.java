package com.zhuwuhui.controller;

import com.zhuwuhui.entity.Book;
import com.zhuwuhui.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author zhuwuhui
 */
@RestController
public class BookController {

    @Resource
    BookService bookService;

    @GetMapping(value = "/api/books")
    public List<Book> list() throws Exception {
        List<Book> list = bookService.getInfo();
        return list;
    }

    @PostMapping(value = "/api/books")
    public void insertBook(Book book) throws Exception {
        bookService.insertBook(book);
    }

    @PostMapping(value = "/api/books/update")
    public void updateBook(Book book) throws Exception {
        bookService.updateBook(book);
    }
}
