package com.refactoring.ilgusi.domain.member;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum RoleEnum {

    GUEST(0, "회원"),
    USER(1, "관리자");

    private final Integer key;
    private final String title;

}
