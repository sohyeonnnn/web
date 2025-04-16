package com.refactoring.ilgusi.application.question;

import com.refactoring.ilgusi.domain.question.QuestionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@RequiredArgsConstructor
@Service
public class QuestionService {
    private final QuestionRepository questionRepository;


}
