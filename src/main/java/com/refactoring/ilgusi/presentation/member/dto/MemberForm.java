package com.refactoring.ilgusi.presentation.member.dto;

import com.refactoring.ilgusi.domain.member.RoleEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MemberForm {
    private String mId;
    private String mPw;
    private String mName;
    private String mEmail;
    private String mPhone;
    private RoleEnum mGrade;

    @Override
    public String toString() {
        return "MemberForm{" +
                "mId='" + mId + '\'' +
                ", mPw='" + mPw + '\'' +
                ", mName='" + mName + '\'' +
                ", mEmail='" + mEmail + '\'' +
                ", mPhone='" + mPhone + '\'' +
                ", mGrade=" + mGrade +
                '}';
    }
}
