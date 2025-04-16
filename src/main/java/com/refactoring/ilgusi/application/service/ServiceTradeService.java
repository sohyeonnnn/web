package com.refactoring.ilgusi.application.service;

import com.refactoring.ilgusi.domain.service.ServiceTradeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Transactional
@RequiredArgsConstructor
@Service
public class ServiceTradeService {
    private final ServiceTradeRepository serviceTradeRepository;


}
