package com.refactoring.ilgusi.config;

import com.refactoring.ilgusi.domain.member.MemberRepository;
import com.refactoring.ilgusi.infrastructure.repository.jpa.member.JpaMemberRepository;
import com.refactoring.ilgusi.infrastructure.repository.jpa.member.SpringDataMemberRepository;
import com.refactoring.ilgusi.infrastructure.repository.mybatis.member.MemberMapper;
import com.refactoring.ilgusi.infrastructure.repository.mybatis.member.MybatisMemberRepository;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@MapperScan(basePackages = "com.refactoring.infrastructure.repository.mybatis")
public class RepositoryConfig {

    @Bean
    @Profile("jpa")
    public MemberRepository jpaMemberRepository(SpringDataMemberRepository repo) {
        return new JpaMemberRepository(repo);
    }

    @Bean
    @Profile("mybatis")
    public MemberRepository myBatisMemberRepository(MemberMapper mapper) {
        return new MybatisMemberRepository(mapper);
    }
}