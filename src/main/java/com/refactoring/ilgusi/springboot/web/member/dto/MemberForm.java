package com.refactoring.ilgusi.springboot.web.member.dto;

import lombok.Getter;

@Getter
public class MemberForm {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
