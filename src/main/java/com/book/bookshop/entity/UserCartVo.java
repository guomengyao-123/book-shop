package com.book.bookshop.entity;

import lombok.Data;

/**
 * @Auther: guomengyao
 * @Date: 2021/2/1 09:48
 * @Description: 用户购物车信息展示对象
 */
@Data
public class UserCartVo {
    private Integer num;
    private double totalPrice;
}
