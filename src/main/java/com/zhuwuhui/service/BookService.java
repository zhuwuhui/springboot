package com.zhuwuhui.service;

import com.zhuwuhui.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    List<Book> getInfo();

    int insertBook(Book book);

    int updateBook(Book book);
}
