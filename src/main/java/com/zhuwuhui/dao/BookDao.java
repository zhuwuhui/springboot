package com.zhuwuhui.dao;

import com.zhuwuhui.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookDao {

    List<Book> getInfo();

    int insertBook(Book book);

    int updateBook(Book book);
}
