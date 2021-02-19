package com.book.bookshop.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.book.bookshop.entity.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Auther: guomengyao
 * @Date: 2021/2/1 09:48
 * @Description: 图书接口
 */
@Mapper
public interface BookMapper extends BaseMapper<Book> {

    /**
     * 插入新书籍
     * @param book
     * @return
     */
    int insertBook(Book book);

}
