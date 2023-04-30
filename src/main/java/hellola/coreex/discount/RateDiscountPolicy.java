package hellola.coreex.discount;

import hellola.coreex.annotation.MainDiscountPolicy;
import hellola.coreex.member.Grade;
import hellola.coreex.member.Member;
import org.springframework.stereotype.Component;

@Component
@MainDiscountPolicy
//@Primary
public class RateDiscountPolicy implements DiscountPolicy {

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}
