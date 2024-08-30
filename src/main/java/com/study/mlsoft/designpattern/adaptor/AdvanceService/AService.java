package com.study.mlsoft.designpattern.adaptor.AdvanceService;

import com.study.mlsoft.designpattern.adaptor.User;
import com.study.mlsoft.designpattern.adaptor.adaptor.FileStorageAdaptor;
import com.study.mlsoft.designpattern.adaptor.repository.Repository;

public class AService {

    public User findUserById(Long id) {
        Repository repository = new FileStorageAdaptor();
        User findUser = repository.findById(id);
        return findUser;
    }
}
