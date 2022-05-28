package hello.core.discount;

import hello.core.Member.Grade;
import hello.core.Member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {         /// VIP라면 1000원 할인 나머지는 0원 할인.
        if (member.getGrade() == Grade.VIP)
        {
            return discountFixAmount;
        }else
        {
            return 0;
        }
    }

}
