package com.book.bookshop.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.book.bookshop.entity.Book;
import com.book.bookshop.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Auther: guomengyao
 * @Date: 2021/2/1 09:48
 * @Description: 图书业务层
 */
@Service
public class BookService extends ServiceImpl<BookMapper,Book> {

    @Resource
    private BookMapper bookMapper;

    @Transactional(rollbackFor = Exception.class)
    public boolean insertBook(Book book){
        return bookMapper.insertBook(book) > 0;
    }

}
