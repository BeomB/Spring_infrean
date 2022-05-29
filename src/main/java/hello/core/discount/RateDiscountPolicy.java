package hello.core.discount;

import hello.core.Member.Grade;
import hello.core.Member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    private int discountRate = 10;


    @Override
    public int discount(Member member, int price) {

        if (member.getGrade() == Grade.VIP)
        {
            price = price * discountRate / 100;
            return price;
        }
        else{
            return 0;
        }

    }
}
