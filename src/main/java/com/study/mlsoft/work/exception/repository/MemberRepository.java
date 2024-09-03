package com.study.mlsoft.work.exception.repository;

import com.study.mlsoft.work.exception.dto.Member;

public interface MemberRepository {
    Member findById(String id);
}
