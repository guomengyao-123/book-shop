package com.book.bookshop.entity;

import lombok.Data;

/**
 * @Auther: guomengyao
 * @Date: 2021/2/1 09:48
 * @Description:
 */
@Data
public class CartVo {
    private Integer id;
    private Integer userId;
    private Integer bookId;
    private Integer count;
    private String bookName;
    private String imgUrl;
    private double newPrice;
}
