package com.study.mlsoft.work.exception.repository;

import com.study.mlsoft.work.exception.MemberNotFoundException;
import com.study.mlsoft.work.exception.dto.Member;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;

@Repository
public class MemberRepositoryImpl implements MemberRepository{

    private static final String FILE_PATH = "파일 정보";


    @Override
    public Member findById(String id) {
        File file = new File(FILE_PATH);

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                if (str.equals(id)) {
                    return new Member(id);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("멤버 정보를 읽는데 실패하였습니다.");
        }

        throw new MemberNotFoundException("멤버 정보가 없습니다.");
    }
}
