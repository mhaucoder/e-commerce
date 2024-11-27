package com.hajuna.ecommerceshop.service.interfaces;

import com.hajuna.ecommerceshop.dto.OrderDto;
import com.hajuna.ecommerceshop.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
