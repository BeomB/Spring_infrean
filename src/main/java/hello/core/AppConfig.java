package hello.core;

import hello.core.Member.MemberRepository;
import hello.core.Member.MemberService;
import hello.core.Member.MemberServiceImpl;
import hello.core.Member.MemoryMemberRepository;
import hello.core.discount.FixDiscountPolicy;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    public MemberRepository memberRepository()
    {
        return new MemoryMemberRepository();
    }


    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), fixDiscountPolicy());
    }

    public FixDiscountPolicy fixDiscountPolicy()
    {
        return new FixDiscountPolicy();
    }


}
