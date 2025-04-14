package com.refactoring.ilgusi.common;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ResultData<T> {
    private boolean isSuccess;
    private String message;
    private T data;

    public static <T> ResultData<T> success(T data, String message) {
        return ResultData.<T>builder()
                .isSuccess(true)
                .message(message)
                .data(data)
                .build();
    }

    public static <T> ResultData<T> fail(String message) {
        return ResultData.<T>builder()
                .isSuccess(false)
                .message(message)
                .data(null)
                .build();
    }

}
