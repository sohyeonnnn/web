package com.sohyeon.board.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor //선언된 모든 final 필드가 포함된 생성자를 생성
public class HelloResponseDto {
    private final String name; //생성자에 포함
    private final int amount; //생성자에 포함
}
