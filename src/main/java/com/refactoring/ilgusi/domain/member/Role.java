package com.refactoring.ilgusi.domain.member;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Role {

    GUEST("ROLE_GUEST", "회원"),
    USER("ROLE_ADMIN", "관리자");

    private final String key;
    private final String title;

}
