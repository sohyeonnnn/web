package study;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import study.domain.discount.DiscountPolicy;
import study.domain.discount.RateDiscountPolicy;
import study.domain.member.repository.MemberRepository;
import study.domain.member.repository.SpringDataJpaMemberRepository;
import study.service.order.OrderService;
import study.service.order.OrderServiceImpl;


@Configuration
public class SpringConfig {

    //private final DataSource dataSource;
    //private final EntityManager em;
    private final SpringDataJpaMemberRepository repository;

    //SpringDataJpaMemberRepository 사용하면 dataSource, em 필요없음, spring이 알아서 해줌
    public SpringConfig(/*DataSource dataSource, EntityManager em,*/ SpringDataJpaMemberRepository repository) {
        /*this.dataSource = dataSource;
        this.em = em;*/
        this.repository = repository;
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
        //return new JpaMemberRepository(em);
        return repository;
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy(); //변경 필요할때 여기만 바꿔주면된다
    }
}