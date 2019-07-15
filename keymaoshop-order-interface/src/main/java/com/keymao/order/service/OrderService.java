package com.keymao.order.service;


import com.keymao.common.utils.E3Result;
import com.keymao.order.pojo.OrderInfo;

public interface OrderService {

	E3Result createOrder(OrderInfo orderInfo);
}
