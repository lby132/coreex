package hellola.coreex;

import hellola.coreex.discount.DiscountPolicy;
import hellola.coreex.discount.RateDiscountPolicy;
import hellola.coreex.member.MemberRepository;
import hellola.coreex.member.MemberService;
import hellola.coreex.member.MemberServiceImpl;
import hellola.coreex.member.MemoryMemberRepository;
import hellola.coreex.order.OrderService;
import hellola.coreex.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public OrderService orderService() {
//        return new OrderServiceImpl(memberRepository(), discountPolicy());
        return null;
    }

    @Bean
    public DiscountPolicy discountPolicy() {
//        return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }
}
