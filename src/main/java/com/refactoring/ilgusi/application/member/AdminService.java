package com.refactoring.ilgusi.application.member;

import com.refactoring.ilgusi.domain.member.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;


@Transactional
@RequiredArgsConstructor
@Service
public class AdminService {
    private final AdminRepository adminRepository;
    //private final BCryptPasswordEncoder encoder;

}
