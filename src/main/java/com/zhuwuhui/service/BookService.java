package com.zhuwuhui.service;

import com.zhuwuhui.entity.Book;
import com.zhuwuhui.entity.BookDto;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    List<Book> getInfo();

    List<BookDto> getInfoByCategoryId(@Param("cId") Integer cId);

    int insertBook(Book book);

    int updateBook(Book book);
}
