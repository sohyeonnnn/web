package study.service.order;

import study.domain.order.Order;

import javax.transaction.Transactional;

@Transactional
public interface OrderService {
    Order createOrder(Long memberId, String itemName, int itemPrice);
}
