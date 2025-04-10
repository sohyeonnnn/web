package study.service.order;

import study.domain.discount.DiscountPolicy;
import study.domain.member.Member;
import study.domain.member.repository.MemberRepository;
import study.domain.order.Order;

import javax.transaction.Transactional;

/*
* 스프링은 해당 클래스의 메서드를 실행할 때 트랜잭션을 시작하고, 메서드가 정상 종료되면 트랜잭션을 커밋한다.
* 만약 런타임 예외가 발생하면 롤백한다.
* JPA를 통한 모든 데이터 변경은 트랜잭션 안에서 실행해야 한다.
* */
//@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    private final MemberRepository memberRepository;// = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy;
    //변경필요하면 여기만 바꾸면된다
    //private final DiscountPolicy discountPolicy = new FixDiscountPolicy();
    //private final DiscountPolicy discountPolicy = new RateDiscountPolicy();

    //but 인터페이스에만 의존하도록 코드 변경
    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }


    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
