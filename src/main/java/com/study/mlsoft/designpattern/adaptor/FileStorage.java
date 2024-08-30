package com.study.mlsoft.designpattern.adaptor;

import java.io.*;

/**
 * 의존 역전에 대한 위반
 * */
public class FileStorage {

    /**
     * 파일 열기 메서드
     * */
    public File openFile(String filePath) {
        return new File(filePath);
    }

    /**
     * 파일 읽기 메서드
     * */
    public String readFile(File file) throws Exception{
        StringBuilder sb = new StringBuilder();
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String str;
        while ((str = reader.readLine()) != null) {
            sb.append(String.format("%s\n", str));
        }
        reader.close();
        return sb.toString();
    }

    /**
    * 파일 저장 메서드
    * */
    public void saveFile(File file, String outputStr) throws Exception{
        BufferedWriter writer = new BufferedWriter(new FileWriter(file.getAbsolutePath(), false));
        writer.write(outputStr);
        writer.close();
    }
}
