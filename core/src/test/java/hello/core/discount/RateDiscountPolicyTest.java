package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    DiscountPolicy discountPolicy = new RateDiscountPolicy();
    @Test
    @DisplayName("vip는 10퍼센트 할인이 적용되어야 한다")
    void discount() {
        //g
        Member member = new Member(1L, "memberVIP", Grade.VIP);
        //w
        int discount = discountPolicy.discount(member, 10000);
        //t
        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("vip가 아니면 10퍼센트 할인이 적용되지 않아야 한다")
    void discount_x() {
        //g
        Member member = new Member(1L, "memberBASIC", Grade.BASIC);
        //w
        int discount = discountPolicy.discount(member, 10000);
        //t
        assertThat(discount).isEqualTo(0);
    }
}