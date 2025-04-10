package com.refactoring.ilgusi.springboot.service.member;

import com.refactoring.ilgusi.springboot.domain.member.Member;
import com.refactoring.ilgusi.springboot.domain.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@RequiredArgsConstructor
@Service
public class MemberService {
    private final MemberRepository memberRepository;

    public Member registerMember(Member m) {
        // 비번 암호화
//		m.setMPw(encPw(m.getMPw()));

        return memberRepository.save(m);
    }

    /*public MemberResponseDto findById(String id){
        *//*Optional<Member> entity = memberRepository.findById(id);
        return new MemberResponseDto(entity.get());*//*
        System.out.println("!!");
        return null;
    }*/

    /**
     *
     회원가입
     */
    /*public Integer join(Member member) {
        validateDuplicateMember(member); //중복 회원 검증
        memberRepository.save(member);
        return member.getMNo();
    }
    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getMName())
                .ifPresent(m -> {
                    throw new IllegalStateException("이미 존재하는 회원입니다.");
                });
    }*/
    /**
     *
     전체 회원 조회
     */
    /*public List<Member> findMembers() {
        return memberRepository.findAll();
    }
    public Optional<Member> findOne(String memberId) {
        return memberRepository.findById(memberId);
    }
*/


   /* @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto){
        Posts posts = postsRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 게시글이 없습니다. id = "+id));

        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    public PostsResponseDto findById(Long id){
        Posts entity = postsRepository.findById(id)
                .orElseThrow(()->new IllegalArgumentException("해당 게시글이 없습니다. id = "+id));
        return new PostsResponseDto(entity);
    }

    @Transactional(readOnly = true)
    public List<PostsListResponseDto> findAllDesc(){
        return postsRepository.findAllDesc().stream()
                .map(PostsListResponseDto::new)
                .collect(Collectors.toList());
    }

    @Transactional
    public void delete(Long id){
        Posts posts = postsRepository.findById(id)
                .orElseThrow(()-> new IllegalArgumentException("해당 게시글이 없습니다. id="+id));
        postsRepository.delete(posts);
    }*/



}
