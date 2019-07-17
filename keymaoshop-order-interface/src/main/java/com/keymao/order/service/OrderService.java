package com.keymao.order.service;


import com.keymao.common.utils.E3Result;
import com.keymao.order.pojo.OrderInfo;

public interface OrderService {
	/**
	 * 返回E3Result，包含订单号
	 * @param orderInfo
	 * @return
	 */
	E3Result createOrder(OrderInfo orderInfo);
}
