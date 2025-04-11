package study.service.member;

import org.springframework.stereotype.Service;
import study.domain.member.Member;
import study.domain.member.repository.MemberRepository;

import javax.transaction.Transactional;
import java.util.NoSuchElementException;
import java.util.Optional;

/*
* 스프링은 해당 클래스의 메서드를 실행할 때 트랜잭션을 시작하고, 메서드가 정상 종료되면 트랜잭션을 커밋한다.
* 만약 런타임 예외가 발생하면 롤백한다.
* JPA를 통한 모든 데이터 변경은 트랜잭션 안에서 실행해야 한다.
* */
@Service
@Transactional
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository ;//= new MemoryMemberRepository();
    //@Autowired
    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    /**
     *
     회원가입
     */
    public void join(Member member) {
        memberRepository.save(member);
    }
    /*@Override
    public void join(Member member) {
        validateDuplicateMember(member); //중복 회원 검증
        memberRepository.save(member);
        //return member.getId();
    }
    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }*/
    /**
     *
     전체 회원 조회
     */

/*    public Optional<Member> findMember(Long memberId) {
        return memberRepository.findById(memberId)
                .orElseThrow(() -> new NoSuchElementException("회원이 존재하지 않습니다"));
    }*/
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId).orElse(null);
    }


    /*public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }*/
}
