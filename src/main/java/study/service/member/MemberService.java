package study.service.member;

import org.springframework.stereotype.Service;
import study.domain.member.Member;

import javax.transaction.Transactional;

@Transactional
public interface MemberService {
void join (Member member);
Member findMember(Long memberId);
}
