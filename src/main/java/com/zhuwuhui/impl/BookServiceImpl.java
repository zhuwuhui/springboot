package com.zhuwuhui.impl;

import com.zhuwuhui.dao.BookDao;
import com.zhuwuhui.entity.Book;
import com.zhuwuhui.entity.BookDto;
import com.zhuwuhui.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookDao bookDao;

    @Override
    public List<Book> getInfo() {
        return bookDao.getInfo();
    }

    @Override
    public List<BookDto> getInfoByCategoryId(Integer cId) {
        return bookDao.getInfoByCategoryId(cId);
    }

    @Override
    public int insertBook(Book book){
        return bookDao.insertBook(book);
    }

    @Override
    public int updateBook(Book book){
        return bookDao.updateBook(book);
    }
}
