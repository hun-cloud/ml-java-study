package com.study.mlsoft.designpattern.adaptor.adaptor;

import com.study.mlsoft.designpattern.adaptor.FileStorage;
import com.study.mlsoft.designpattern.adaptor.User;
import com.study.mlsoft.designpattern.adaptor.repository.Repository;

import java.io.File;

public class FileStorageAdaptor implements Repository {

    private FileStorage fileStorage = new FileStorage();
    private static final String FILE_NAME = "file full path";

    @Override
    public User findById(Long id) {
        try {
            File file = fileStorage.openFile(FILE_NAME);
            String content = fileStorage.readFile(file);

            // todo 파일에서 유저 찾는 로직
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("파일 읽기 실패");
        }

        return new User("이름", 20);
    }

    @Override
    public void save(User user) {
        try {
            File file = fileStorage.openFile(FILE_NAME);
            String content = fileStorage.readFile(file);

            // todo 파일에 유저 저장 로직
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("파일 읽기 실패");
        }
    }
}
