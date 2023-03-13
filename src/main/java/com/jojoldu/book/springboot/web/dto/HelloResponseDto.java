package com.jojoldu.book.springboot.web;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    /**
     * 1. @Getter 선언된 모든 필드의 get메소드를 생성
     * 2. @RequiredArgsConstructor
     *    선언된 모든 final 필드가 포함된 생성자를 생성
     *    final이 없는 필드는 생성자에 포함하지 않는다
     */
    private final String name;
    private final int amount;
}
