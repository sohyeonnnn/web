package com.sohyeon.board.springboot.web.dto;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class) // 스프링 부트 테스트와 junit 사이에 연결자 역할
public class HelloResponseDtoTest {

    @Test
    public void lombok_function_test(){ //getName, getAmount 작동 테스트
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name,amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
