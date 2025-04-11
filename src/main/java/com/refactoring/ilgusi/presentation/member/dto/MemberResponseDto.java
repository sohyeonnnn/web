package com.refactoring.ilgusi.presentation.member.dto;

import lombok.Getter;

@Getter
public class MemberResponseDto {

    private int no;
    private String id;
    private String name;

    public MemberResponseDto(int no, String id, String name) {
        this.no = no;
        this.id = id;
        this.name = name;
    }
}
