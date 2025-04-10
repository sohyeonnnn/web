package study;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.domain.discount.DiscountPolicy;
import study.domain.discount.FixDiscountPolicy;
import study.domain.discount.RateDiscountPolicy;
import study.domain.member.repository.JpaMemberRepository;
import study.domain.member.repository.MemberRepository;
import study.domain.member.repository.MemoryMemberRepository;
import study.service.member.MemberService;
import study.service.member.MemberServiceImpl;
import study.service.order.OrderService;
import study.service.order.OrderServiceImpl;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    private final MemberRepository memberRepository;
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(
                memberRepository(),
                discountPolicy());
    }
    @Bean
    public MemberRepository memberRepository() {
        //return new MemoryMemberRepository();
        return new JpaMemberRepository(em);
    }
    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy(); //변경 필요할때 여기만 바꿔주면된다
    }
}