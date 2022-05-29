package hello.core.discount;

import hello.core.Member.Grade;
import hello.core.Member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP가 할인을 받을 때")
    void VIP할인()
    {
        Member member = new Member(1L,"name", Grade.VIP);
        int discount = rateDiscountPolicy.discount(member,10000);
        Assertions.assertThat(discount).isEqualTo(1000);

    }

    @Test
    @DisplayName("VIP가 할인을 안받을 때")
    void VIP할인X()
    {
        Member member = new Member(2L,"name2", Grade.BASIC);
        int discount = rateDiscountPolicy.discount(member,10000);
        Assertions.assertThat(discount).isEqualTo(0);

    }


}