package com.study.mlsoft.work.exception.service;

import com.study.mlsoft.work.exception.dto.Member;
import com.study.mlsoft.work.exception.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public Member findById(String id) {
        return memberRepository.findById(id);
    }
}
