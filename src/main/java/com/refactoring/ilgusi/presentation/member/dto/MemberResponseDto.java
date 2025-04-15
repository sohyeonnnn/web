package com.refactoring.ilgusi.presentation.member.dto;

import com.refactoring.ilgusi.domain.member.RoleEnum;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Getter
public class MemberResponseDto {

    private String mId;
    private String mPw;
    private String mName;
    private String mEmail;
    private String mPhone;
    private RoleEnum mGrade;


}
