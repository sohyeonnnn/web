package com.refactoring.ilgusi.config;

import com.refactoring.ilgusi.domain.category.CategoryRepository;
import com.refactoring.ilgusi.domain.member.MemberRepository;
import com.refactoring.ilgusi.domain.notice.NoticeRepository;
import com.refactoring.ilgusi.infrastructure.repository.jpa.category.JpaCategoryRepository;
import com.refactoring.ilgusi.infrastructure.repository.jpa.category.SpringDataCategoryRepository;
import com.refactoring.ilgusi.infrastructure.repository.jpa.member.JpaMemberRepository;
import com.refactoring.ilgusi.infrastructure.repository.jpa.member.SpringDataMemberRepository;
import com.refactoring.ilgusi.infrastructure.repository.jpa.notice.JpaNoticeRepository;
import com.refactoring.ilgusi.infrastructure.repository.jpa.notice.SpringDataNoticeRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
//@MapperScan(basePackages = "com.refactoring.infrastructure.repository.mybatis")
public class RepositoryConfig {

    @Bean
    @Profile("jpa")
    public MemberRepository jpaMemberRepository(SpringDataMemberRepository repo) {
        return new JpaMemberRepository(repo);
    }

    @Bean
    @Profile("jpa")
    public CategoryRepository jpaCategoryRepository(SpringDataCategoryRepository repo) {
        return new JpaCategoryRepository(repo);
    }

    @Bean
    @Profile("jpa")
    public NoticeRepository jpaNoticeRepository(SpringDataNoticeRepository repo) {
        return new JpaNoticeRepository(repo);
    }

  /*  @Bean
    @Profile("mybatis")
    public MemberRepository myBatisMemberRepository(MemberMapper mapper) {
        return new MybatisMemberRepository(mapper);
    }*/

}