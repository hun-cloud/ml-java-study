package com.study.mlsoft.designpattern.adaptor.repository;

import com.study.mlsoft.designpattern.adaptor.User;

public interface Repository {
    User findById(Long id);
    void save(User user);
}
