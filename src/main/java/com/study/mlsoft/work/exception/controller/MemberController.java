package com.study.mlsoft.work.exception.controller;

import com.study.mlsoft.work.exception.dto.Member;
import com.study.mlsoft.work.exception.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/members")
public class MemberController {

    private final MemberService memberService;

    @GetMapping
    public Member getMember(String id) {
        return memberService.findById(id);
    }
}
