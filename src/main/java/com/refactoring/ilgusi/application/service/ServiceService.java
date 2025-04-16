package com.refactoring.ilgusi.application.service;

import com.refactoring.ilgusi.domain.service.ServiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@RequiredArgsConstructor
@Service
public class ServiceService {
    private final ServiceRepository serviceRepository;


}
