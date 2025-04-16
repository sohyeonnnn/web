package com.refactoring.ilgusi.infrastructure.repository.jpa.question;

import com.refactoring.ilgusi.domain.question.Question;
import com.refactoring.ilgusi.domain.question.QuestionRepository;

import java.util.List;

public class JpaQuestionRepository implements QuestionRepository {
    private final SpringDataQuestionRepository jpaRepository;

    public JpaQuestionRepository(SpringDataQuestionRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public List<Question> selectQuestionList() {
        return null;//List.of();
    }

    @Override
    public List<Question> selectQuestionList(int begin, int end) {
        return null;//List.of();
    }

    @Override
    public List<Question> selectQuestionList(int begin, int end, int type, String keyword) {
        return null;//List.of();
    }

    @Override
    public int insertQuestion(Question q) {
        return 0;
    }

    @Override
    public Question selectOneQuestion(int qNo) {
        return null;
    }

    @Override
    public int selectQuestionCount() {
        return 0;
    }

    @Override
    public int selectQuestionCount(int type, String keyword) {
        return 0;
    }

    @Override
    public int updateAnswer(Question q) {
        return 0;
    }

    @Override
    public int updateQuestion(Question q) {
        return 0;
    }

    @Override
    public int deleteQuestion(int qNo) {
        return 0;
    }
}
