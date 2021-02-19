package com.book.bookshop.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.book.bookshop.entity.OrderItem;
import com.book.bookshop.mapper.OrderItemMapper;
import org.springframework.stereotype.Service;

/**
 * @Auther: guomengyao
 * @Date: 2021/2/1 09:48
 * @Description:
 */
@Service
public class OrderItemService extends ServiceImpl<OrderItemMapper,OrderItem> {
}
