package com.zhuwuhui.dao;

import com.zhuwuhui.entity.Book;
import com.zhuwuhui.entity.BookDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BookDao {

    List<Book> getInfo();

    List<BookDto> getInfoByCategoryId(@Param("cId") Integer cId);

    int insertBook(Book book);

    int updateBook(Book book);
}
