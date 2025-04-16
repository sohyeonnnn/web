package com.refactoring.ilgusi.application.request;

import com.refactoring.ilgusi.domain.request.RequestRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@RequiredArgsConstructor
@Service
public class RequestService {
    private final RequestRepository requestRepository;


}
