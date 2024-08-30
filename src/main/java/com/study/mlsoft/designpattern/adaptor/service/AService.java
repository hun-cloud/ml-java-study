package com.study.mlsoft.designpattern.adaptor.service;

import com.study.mlsoft.designpattern.adaptor.FileStorage;

import java.io.File;

public class AService {

    public File fileOpen(String fileName) {
        FileStorage fileStorage = new FileStorage();
        return fileStorage.openFile(fileName);
    }
}
