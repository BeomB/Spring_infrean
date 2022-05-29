package hello.core.order;

import hello.core.Member.Member;
import hello.core.Member.MemberRepository;
import hello.core.Member.MemoryMemberRepository;
import hello.core.discount.DiscountPolicy;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    /**
     * --> DIP 의존을 막아주기 위한 해결 방안 이게 스프링의 역할.
     */


    //    DiscountPolicy discountPolicy = new FixDiscountPolicy();
    //    DiscountPolicy discountPolicy = new RateDiscountPolicy();   // -> 추상화 구체화에 모두 의존하기 때문에 DIP 를 지키지 못함.

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member OrderMember = memberRepository.findById(memberId);
        int discountAmount = discountPolicy.discount(OrderMember, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountAmount);
    }


}
