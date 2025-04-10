package com.refactoring.ilgusi.springboot.web.member.dto;

import com.refactoring.ilgusi.springboot.domain.member.Member;
import lombok.Getter;

@Getter
public class MemberResponseDto {

    private int mNo;
    private String mId;
    private String mName;

    public MemberResponseDto(Member entity){
        this.mNo = entity.getMNo();
        this.mId = entity.getMId();
        this.mName = entity.getMName();
    }
}
