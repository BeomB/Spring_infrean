package hello.core;

import hello.core.Member.Grade;
import hello.core.Member.Member;
import hello.core.Member.MemberService;
import hello.core.Member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    @Test
    void OrderService()
    {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Member member = new Member(1L,"이범기", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(1L,"피자",8000);
        Assertions.assertThat(1000).isEqualTo(order.getDiscountPrice());
    }


}
